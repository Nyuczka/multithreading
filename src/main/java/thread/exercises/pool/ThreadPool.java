package thread.exercises.pool;

import java.util.Arrays;
import java.util.List;

public class ThreadPool extends Thread {
    private List<Thread> group;
    private int poolSize;

    public ThreadPool(int poolSize) {
        this.poolSize = poolSize;
        group = Arrays.asList(new Thread[poolSize]);
    }



}
