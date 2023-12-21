package useMultithread.NonThreadSafe.ServletExample;

public class BLogin extends Thread {

    @Override
    public void run() {
        useMultithread.NonThreadSafe.ServletExample.LoginServlet.doPost("b", "bb");
    }
}
