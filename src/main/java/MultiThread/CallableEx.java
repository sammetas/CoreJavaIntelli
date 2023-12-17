package MultiThread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class CallableEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int THREAD_POOL_SIZE = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        List<Future<Map<Integer, String>>> list = new ArrayList<>();

        File file = new File("/Users/samm/Downloads/abc.txt");
        int fileSize = (int) file.length();
        int chunk = fileSize / THREAD_POOL_SIZE;

        for (int i = 0; i < THREAD_POOL_SIZE; i++) {
            int start = i * chunk;
            int end = Math.min(start + chunk, fileSize);

            Future<Map<Integer, String>> linesMap = executorService.submit(
                    new ReadFiles(start, end, file.getPath()));
            list.add(linesMap);
        }

        for (Future<Map<Integer, String>> future : list) {
            Map<Integer, String> map = future.get();
            System.out.println(map);
        }

        executorService.shutdown();
    }
}

class ReadFiles implements Callable<Map<Integer, String>> {
    int start;
    int end;
    String filePath;
    private static final Object lock = new Object(); // Synchronization lock
    public ReadFiles(int start, int end, String filePath) {
        this.start = start;
        this.end = end;
        this.filePath = filePath;
    }

    @Override
    public Map<Integer, String> call() throws Exception {
        HashMap<Integer, String> map = new HashMap<>();

        synchronized (lock) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
                for (int i = 0; i < start; i++) {
                    bufferedReader.readLine();
                }
                for (int i = start; i < end; i++) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        System.out.println("Lines from Thread " + Thread.currentThread().getName() + ": " + line);
                        map.put(i, line);
                    } else {
                        break;
                    }
                }
            }
        }

        return map;
    }
}

