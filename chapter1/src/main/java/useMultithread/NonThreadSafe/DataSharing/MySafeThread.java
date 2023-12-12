package useMultithread.NonThreadSafe.DataSharing;

public class MySafeThread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count --;
        // 不使用while，会导致其他线程得不到运行的机会
        // 第一个执行while语句的线程会将count减到0
        System.out.println(this.currentThread().getName() + ": count = "
                + count);
    }
}
