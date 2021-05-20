package MultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;

public class CyclicBarrierDemo {
    CyclicBarrier cyclicBarrier;
    int nThread;
    int max;
    int result;
    List<List<Integer>> fin=new ArrayList<>();
    CyclicBarrierDemo(int noOfThreads,int random){
        nThread=noOfThreads;
        max=random;
        //cyclicBarrier=new CyclicBarrier(nThread);
        result=0;
    }

    class NumbersAddThread implements Runnable{

        @Override
        public void run() {
            String thisThreadName = Thread.currentThread().getName();
            List<Integer> partialResult = new ArrayList<>();
            Random r=new Random();
        for(int i=0;i<max;i++){
            int n=r.nextInt(10);
            System.out.println("Adding no by "+thisThreadName+" No::"+n);
        partialResult.add(n);
        }
    fin.add(partialResult);

             try {System.out.println(thisThreadName
                    + " waiting for others to reach barrier.");
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    class SumThread implements  Runnable{
        @Override
        public void run() {
            String thisThreadName = Thread.currentThread().getName();

            System.out.println(
                    thisThreadName + ": Computing sum of " + max
                            + " workers, having " + nThread + " results each.");
            for(List<Integer> list:fin){
                list.forEach(i->result+=i);
            }
            System.out.println("Reslut::"+result);


        }
    }

    public void runSimulation() {


     cyclicBarrier = new CyclicBarrier(nThread, new SumThread());

 //new Thread(new SumThread()).start();
        System.out.println("Spawning " + nThread
                + " worker threads to compute "
                + max + " partial results each");

        for (int i = 0; i < nThread; i++) {
            Thread worker = new Thread(new NumbersAddThread());
            worker.setName("Thread " + i);
            worker.start();
        }
    }
    public static void main(String[] args) {

        CyclicBarrierDemo cyclicBarrierDemo= new CyclicBarrierDemo(6,4);
        cyclicBarrierDemo.runSimulation();
    //    Exchanger<String> exchanger=new Exchanger<>();

    }
}
