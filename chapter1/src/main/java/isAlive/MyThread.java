package isAlive;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("isAlive = " + this.isAlive());
    }
}
