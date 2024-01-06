package stopThread.determineWhetherStopped.testInterrupted;

public class InterruptInMain {
    /* interrupted()具有清除中断状态的功能 */
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("stopped first time ? " + Thread.interrupted());
        System.out.println("stopped second time ? " + Thread.interrupted());
        System.out.println("end");
    }
}
