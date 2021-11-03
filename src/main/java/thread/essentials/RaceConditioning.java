package thread.essentials;

public class RaceConditioning {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
               for (int i = 0; i < 1000; i++){
                   counter.increment();
               }
            }
        };

        Thread firstThread = new Thread(runnable);
        Thread secondThread = new Thread(runnable);
        Thread thirdThread = new Thread(runnable);

        firstThread.start();
        secondThread.start();
        thirdThread.start();

//        firstThread.join();
//        secondThread.join();
//        thirdThread.join();

        System.out.println(counter.getCount());

    }
}
