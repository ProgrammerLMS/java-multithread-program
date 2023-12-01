package useMultithread.RandomnessInMultithread;

public class AnotherExample {
    static class MyThread extends Thread {
        private int i;

        public MyThread(int i) {
            super();
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);
        MyThread t4 = new MyThread(4);
        MyThread t5 = new MyThread(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
