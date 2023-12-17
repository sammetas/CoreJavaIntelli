package MultiThread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import static java.nio.file.Files.readAllLines;

public class FutureExample {
    ExecutorService executorService=Executors.newFixedThreadPool(5);
    StringBuffer sb= new StringBuffer();
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureExample f=new FutureExample();


        new Thread(f.getString("iops")).start();
        f.sb.append("\n");
        new Thread(f.getString("sops")).start();
        System.out.println(f.sb.toString()+"-----------------------------------------");

Future<String> strings=f.getFutureStrings("youcan");
        Future<String> strings1=f.getFutureStrings("you");

        System.out.println("This is from Future:::"+strings.get());

        f.executorService.shutdown();


    }

    public Runnable getString(String search) {
        return () -> {

                List<String> list = null;
                try {
                    list = Files.
                            readAllLines(Path.of("D:\\MicroWorkSpace\\CoreJavaIntelli\\src\\main\\java\\abc.txt"));
                    list.stream().filter(line -> line.contains(search))
                            .collect(Collectors.toList()).forEach(sb::append);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            System.out.println(sb.toString()+" -" +Thread.currentThread().getName());
             //   list.stream().filter(line -> line.contains("java")).collect(Collectors.toList());

            };
        }

        public Future<String> getFutureStrings(String search){

            return executorService.submit(() -> {
                List<String> list = null;
                try {
                    list = Files.
                            readAllLines(Path.of("D:\\MicroWorkSpace\\CoreJavaIntelli\\src\\main\\java\\abc.txt"));
                    list.stream().filter(line -> line.contains(search))
                            .toList().forEach(sb::append);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("-->"+Thread.currentThread().getName());
                return sb.toString();
            });

        }


}


