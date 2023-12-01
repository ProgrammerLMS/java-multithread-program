package useMultithread.ExtendsThread;

public class RunMyThreadByOrder {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        /* use start method to call run method */
        myThread.start();
        /* call thread to sleep */
        Thread.sleep(200);
        System.out.println("thread is over！");
    }
}
