package stopThread.unstoppableThread;

public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(20);
        myThread.interrupt();
        System.out.println("it seems that we cannot stop it");
    }
}
