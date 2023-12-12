package useMultithread.NonThreadSafe.NonDataSharing;

public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while(count > 0) {
            System.out.println(this.getName() + ": count = "
                    + count);
            count --;
        }
    }
}
