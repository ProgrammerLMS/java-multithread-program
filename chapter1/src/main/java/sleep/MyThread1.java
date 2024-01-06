package sleep;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("run threadName = " +
                currentThread().getName() + "  begin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run threadName = " +
                currentThread().getName() + "  end");
    }
}
