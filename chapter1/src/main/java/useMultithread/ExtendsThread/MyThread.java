package useMultithread.ExtendsThread;

public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("this is my thread");
    }
}
