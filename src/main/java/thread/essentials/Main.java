package thread.essentials;

public class Main {
    public static void main(String[] args) {
        // create new thread after overriding Thread class
        var thread = new MyThread();
        thread.start();

        // create new thread using Runnable lambda
        var runnableThread = new Thread(() -> {
            System.out.println("Hello from runnable thread");
        });
        runnableThread.start();
    }
}
