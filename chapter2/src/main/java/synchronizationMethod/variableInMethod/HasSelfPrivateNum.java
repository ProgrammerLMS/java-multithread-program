package synchronizationMethod.variableInMethod;

public class HasSelfPrivateNum {
    /* 方法内部声明的变量，不存在线程安全问题 */
    public void add(String username) {
        try {
            int num = 0;
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(1000);
            }
            if (username.equals("b")) {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
