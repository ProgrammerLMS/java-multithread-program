package currentThread.CompareRunAndStart;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=====调用start=====");
        MyThread t1 = new MyThread();
        t1.start(); //run方法被JVM自动调用，会创建新的线程，所以时机不确定

        Thread.sleep(3000);

        System.out.println("=====调用run=====");
        MyThread t2 = new MyThread();
        t2.run(); //立即由main线程调用该方法，不通过JVM创建新的线程
    }
}
