package stopThread.determineWhetherStopped.testInterrupted;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(25);
        thread.interrupt();
        System.out.println("stopped ? " + Thread.interrupted());
        System.out.println("end");
    }
}
