package MultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
  Difference between Callable and Runnable is that Callable's call can return a value after exeuction of run method where as Runnable can't
 */
public class CallableAgain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list  = new ArrayList<>();
        ExecutorService executors =  Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            Future<Integer> result = executors.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
                return new Random().nextInt(10000);
            });
            list.add(result.get());
        }
        System.out.println(list);
        executors.shutdown();
    }
}
