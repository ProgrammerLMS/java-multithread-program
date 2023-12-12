package useMultithread.NonThreadSafe.DataSharing;

public class DangerousRun {
    public static void main(String[] args) {
        /* 在Thread的构造方法中，第一个传入的是Runnable对象 */
        /* 如果我们在Runnable参数位置中传入一个Thread对象
           实际上就是让其他线程都调用这个Thread的run()方法 */
        MyDangerousThread myThread = new MyDangerousThread();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");
        Thread d = new Thread(myThread, "d");
        Thread e = new Thread(myThread, "e");
//        MyDangerousThread a = new MyDangerousThread();
//        a.setName("a");
//        MyDangerousThread b = new MyDangerousThread();
//        b.setName("b");
//        MyDangerousThread c = new MyDangerousThread();
//        c.setName("c");
//        MyDangerousThread d = new MyDangerousThread();
//        d.setName("d");
//        MyDangerousThread e = new MyDangerousThread();
//        e.setName("e");

        /* 也就是说，实际上这五次运行，都是调用同一个线程的run()方法 */
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
