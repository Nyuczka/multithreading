package thread.essentials.sync;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        Thread deposit = new Thread(() -> {
            bankAccount.deposit(100);
            System.out.printf("Balance after deposit: %d%n", bankAccount.getBalance());
        });

        Thread withdraw = new Thread(() -> {
            bankAccount.withdraw(100);
            System.out.printf("Balance after withdraw: %d%n", bankAccount.getBalance());
        });

        // If it runs in the same time balance after deposit = 1100
        deposit.start();
        // But balance after withdraw = 900
        withdraw.start();
    }
}
