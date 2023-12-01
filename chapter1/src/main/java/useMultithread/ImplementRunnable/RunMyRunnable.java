package useMultithread.ImplementRunnable;

public class RunMyRunnable {
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("running !");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("running over");
    }
}
