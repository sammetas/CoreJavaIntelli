package MultiThread;
/*
 If you declare countdown latch with 3 count, then waiting thread will wait until all threads available.
 */
import java.util.concurrent.CountDownLatch;

import static java.lang.Thread.sleep;

public class CountDownLatchEx {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch= new CountDownLatch(3);

        Runnable waiter=()->{
            try {
                System.out.println("about to wait");
                countDownLatch.await();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("Wait Released..");
            }
            ;
        };
        new Thread(waiter).start();
        new Thread(()->{
            try {
                sleep(1000);
                countDownLatch.countDown();
                System.out.println(countDownLatch.getCount());
                sleep(1000);
                countDownLatch.countDown();
                System.out.println(countDownLatch.getCount());
                sleep(1000);
                countDownLatch.countDown(); //if we comment this line it will wait forever.s
                System.out.println(countDownLatch.getCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
        System.out.println("Finally....out");
        sleep(1000);
    }
}
