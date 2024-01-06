package sleep;

public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin time = " + System.currentTimeMillis());
        // 并没有真正创建这个线程
        myThread1.run();
        System.out.println("end time = " + System.currentTimeMillis());
    }
}
