package useMultithread.NonThreadSafe.DataSharing;

public class SafeRun {

    public static void main(String[] args) {
        useMultithread.NonThreadSafe.DataSharing.MySafeThread myThread = new useMultithread.NonThreadSafe.DataSharing.MySafeThread();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");
        Thread d = new Thread(myThread, "d");
        Thread e = new Thread(myThread, "e");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
