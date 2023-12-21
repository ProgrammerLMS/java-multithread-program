package useMultithread.NonThreadSafe.ServletExample;

public class ALogin extends Thread {

    @Override
    public void run() {
        useMultithread.NonThreadSafe.ServletExample.LoginServlet.doPost("a", "aa");
    }
}
