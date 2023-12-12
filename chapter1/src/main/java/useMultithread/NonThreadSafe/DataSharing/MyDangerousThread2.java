package useMultithread.NonThreadSafe.DataSharing;

public class MyDangerousThread2 extends Thread {
    private int count = 0;

    @Override
    public void run() {
        for(int i=0;i < 5;i++) {
            count ++;
            System.out.println(this.currentThread().getName() + ": count = "
                    + count);
        }
    }
}
