package useMultithread.ImplementRunnable;

public class AdvantageOfRunnable {
    static class AServer {
        public void a_save_method() {
            System.out.println("call a method to save data");
        }
    }

    /* we can not use extends AServer, Thread */
    static class BServer extends AServer implements Runnable {
        public void b_save_method() {
            super.a_save_method();
            System.out.println("call b method to save data");
        }

        public void run() {
            b_save_method();
        }
    }
}
