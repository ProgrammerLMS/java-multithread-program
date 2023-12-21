package currentThread.CountOperation;

public class CountOperation extends Thread {

    public CountOperation() {
        System.out.println("count operation -- begin");
        System.out.println("current thread = " + Thread.currentThread().getName());

        System.out.println("this.getName = " + this.getName());
        System.out.println("count operation -- end");
    }

    @Override
    public void run() {
        System.out.println("run -- begin");
        System.out.println("current thread = " + Thread.currentThread().getName());

        System.out.println("this.getName = " + this.getName());
        System.out.println("run -- end");
    }
}
