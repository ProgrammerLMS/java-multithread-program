package isAlive;

public class InnerObjectThread extends Thread{

    public InnerObjectThread() {
        System.out.println("constructor--begin");
        System.out.println("Thread.currentThread().getName() = "
                +Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = "
                + Thread.currentThread().isAlive());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("constructor--end");
    }

    @Override
    public void run() {
        System.out.println("run--begin");
        System.out.println("Thread.currentThread().getName() = "
                +Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = "
                + Thread.currentThread().isAlive());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("run--end");
    }
}
