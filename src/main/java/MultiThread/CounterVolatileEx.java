package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class CounterVolatileEx {
    public static void main(String[] args) {
        Counter1 counter1=new Counter1(1);
        //Counter1 counter2=new Counter1(1);

      /*  ExecutorService executorService= Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i ++) {
            executorService.execute(() -> {
                System.out.println(Thread.currentThread().getName()+"==="+ counter1.increment());
            });
        }
executorService.shutdown();*/
        System.out.println("Final value:::"+counter1.getFinalValue());
//for(int i=0;i<10;i++) {
    new Thread(() -> {
        counter1.increment();
        System.out.println(Thread.currentThread().getName() + "===" + counter1.decrement());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
    new Thread(() -> {

        try {
            counter1.increment();
            sleep(1000);
            System.out.println(Thread.currentThread().getName() + "===" + counter1.decrement());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
    new Thread(() -> {

        try {
            counter1.increment();
            sleep(1000);
            System.out.println(Thread.currentThread().getName() + "===" + counter1.increment());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
    System.out.println("Final value:::" + counter1.getFinalValue());
//}

    }
}


class Counter1{
    private     volatile   int count;

    public Counter1(int count){this.count=count;}
    public int increment(){
        synchronized (this){
        return ++count;}
    }
    public int decrement(){
        synchronized (this){
        return --count;}
    }

    public int getFinalValue() {
        return this.count;
    }
}