package currentThread.CountOperation;

public class Test {

    public static void main(String[] args) {
        CountOperation countOperation = new CountOperation();
        Thread t = new Thread(countOperation);

        t.setName("a");

        t.start();
    }
}
