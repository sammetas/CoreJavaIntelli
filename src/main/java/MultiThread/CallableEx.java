package MultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        List<Future<Integer>> list=new ArrayList<>();

    for(int i=0;i<5;i++) {
    Future<Integer> name = executorService.submit(() -> {
        Thread.sleep(1000);
        return new Random().nextInt(400);
    });


        list.add(name);
}
  for(Future<Integer> a:list){
      System.out.println(a.get());
  }
  executorService.shutdown();
    }
}



