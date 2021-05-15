package MultiThread;

import java.util.concurrent.CountDownLatch;

import static java.lang.Thread.sleep;

public class CountDownLatchEx {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch= new CountDownLatch(4);

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
                countDownLatch.countDown();
                System.out.println(countDownLatch.getCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
        System.out.println("Fially....out");
        sleep(1000);
    }
}
