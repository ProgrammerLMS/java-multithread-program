package isAlive;

public class Test2 {
    public static void main(String[] args) throws InterruptedException{
        MyThread myThread = new MyThread();
        System.out.println("begin1==" + myThread.isAlive());
        myThread.start();
        Thread.sleep(2000);
        System.out.println("end==" + myThread.isAlive());
    }
}
