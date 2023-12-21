package useMultithread.NonThreadSafe.ServletExample;

public class LoginServlet {
    private static String usernameRef;

    private static String passwordRef;

    public static void doPost(String username, String password) {
        usernameRef = username;
        if (username.equals("a")) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        passwordRef = password;
        System.out.println("usernameRef = " + usernameRef +
                " password = " + password);

    }
}
