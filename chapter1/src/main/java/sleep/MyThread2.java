package sleep;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("run threadName = " +
                currentThread().getName() + "  begin time = " + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run threadName = " +
                currentThread().getName() + "  end time = " + System.currentTimeMillis());
    }
}
