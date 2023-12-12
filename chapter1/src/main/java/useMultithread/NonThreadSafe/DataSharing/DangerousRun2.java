package useMultithread.NonThreadSafe.DataSharing;

public class DangerousRun2 {
    public static void main(String[] args) {
        MyDangerousThread2 myDangerousThread2 = new MyDangerousThread2();
        Thread a = new Thread(myDangerousThread2, "a");
        Thread b = new Thread(myDangerousThread2, "b");
        Thread c = new Thread(myDangerousThread2, "c");
        Thread d = new Thread(myDangerousThread2, "d");
        Thread e = new Thread(myDangerousThread2, "e");
        Thread f = new Thread(myDangerousThread2, "f");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
    }
}
