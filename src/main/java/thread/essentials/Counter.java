package thread.essentials;

class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }

    public void increment() {
        synchronized (this){
            count++;
        }
    }
}
