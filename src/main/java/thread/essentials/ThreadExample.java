package thread.essentials;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");
        Thread customThread = new Thread(() -> {
            System.out.println("Custom thread starting...");
            for (int i = 0; i < 5; i++) {
                System.out.printf("Custom thread: %d\n", i);
            }
        });
        customThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Main thread: %d\n", i);
        }

    }
}
