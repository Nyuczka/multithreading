package thread.essentials;

public class GroupThread {
    public static void main(String[] args) {
        var group = new ThreadGroup("myGroup");
        var thread = new Thread(group, "myThread");
        thread.start();
    }
}
