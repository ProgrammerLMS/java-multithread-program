package isAlive;

public class InnerObjectThreadRun {
    public static void main(String[] args) {
        InnerObjectThread innerObjectThread = new InnerObjectThread();
        Thread thread = new Thread(innerObjectThread);
        System.out.println("main begin thread isalive = " + thread.isAlive());
        thread.setName("a");
        thread.start(); // thread启动，调用innerThread的run方法
        System.out.println("main end thread isalive = " + thread.isAlive());
    }
}
