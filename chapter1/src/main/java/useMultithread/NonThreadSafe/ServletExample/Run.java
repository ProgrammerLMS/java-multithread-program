package useMultithread.NonThreadSafe.ServletExample;

public class Run {

    public static void main(String[] args) {

        useMultithread.NonThreadSafe.ServletExample.ALogin a = new useMultithread.NonThreadSafe.ServletExample.ALogin();
        a.start();

        useMultithread.NonThreadSafe.ServletExample.BLogin b = new useMultithread.NonThreadSafe.ServletExample.BLogin();
        b.start();

    }
}
