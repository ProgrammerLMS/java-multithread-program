package sleep;

public class Run2 {

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        System.out.println("begin time = " + System.currentTimeMillis());
        myThread2.start();
        System.out.println("end time = " + System.currentTimeMillis());
    }
}
