package useMultithread.RandomnessInMultithread;

public class ShowRandomnessInThread {

    static class MyRandomThread extends Thread {
        @Override
        public void run() {
            for (int i=0;i < 100;i++){
                System.out.println("run = "+ Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        MyRandomThread myRandomThread = new MyRandomThread();
        myRandomThread.setName("myRandomThread");
        myRandomThread.start();

        /* Multithreading is disorganized because the CPU
           divides the time slice among different threads */
        for (int i=0;i < 100;i++) {
            System.out.println("main = " + Thread.currentThread().getName());
        }
    }
}
