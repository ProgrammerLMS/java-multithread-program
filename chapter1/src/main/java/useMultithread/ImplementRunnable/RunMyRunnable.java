package useMultithread.ImplementRunnable;

public class RunMyRunnable {
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("running !");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        /* runnable 对象 传入 Thread的构造方法 */
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("running over");
    }
}
