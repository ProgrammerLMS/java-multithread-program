package useMultithread.ExtendsThread;

public class RunMyThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        /* use start method to call run method */
        myThread.start();
        System.out.println("thread is over！");
        /* real output is :
         * "thread is over!"
         * "this is my thread"
         * */
    }
}
