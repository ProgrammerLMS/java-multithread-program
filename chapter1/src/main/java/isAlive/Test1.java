package isAlive;

public class Test1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin1==" + myThread.isAlive());
        myThread.start();
        // uncertain value
        System.out.println("end==" + myThread.isAlive());
    }
}
