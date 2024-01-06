package stopThread.determineWhetherStopped.testIsInterrupted;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            System.out.println("i = " + (i+1));
        }
    }
}
