package ExtendsThread;

import java.util.concurrent.TimeUnit;

public class UseTimeUnitToSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start :" + System.currentTimeMillis());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("End :" + System.currentTimeMillis());
    }
}
