package thread.sync;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount){
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return this.balance;
    }
}
