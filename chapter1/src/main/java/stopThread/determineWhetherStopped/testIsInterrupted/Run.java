package stopThread.determineWhetherStopped.testIsInterrupted;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(25);
        thread.interrupt();
        /* 不会清除中断标志 */
        System.out.println("stoped? " + thread.isInterrupted());
        System.out.println("stoped? " + thread.isInterrupted());
        System.out.println("end");
    }
}
