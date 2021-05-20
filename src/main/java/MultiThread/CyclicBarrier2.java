package MultiThread;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier2 {
    CyclicBarrier cb;
   public transient ArrayList<Integer> list= new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {


        new CyclicBarrier2().initiator();


    }

    public CyclicBarrier2() throws InterruptedException {
          cb= new CyclicBarrier(3,new B());
        for(int i=0;i<3;i++){
            new Thread(new A()).start();
            Thread.sleep(1000);
        }
    }
    public  void initiator() throws InterruptedException {



    }

    class B implements Runnable{
        @Override
        public void run() {
            try{
                System.out.println(Thread.currentThread().getName()+"Execution started...");
                Thread.sleep(1000);

                System.out.println(list.stream().reduce(0,(a,b)->a+b));
            }catch (InterruptedException ie){

            }finally {
                System.out.println("I am B thread.. I have to execute as a last action!");
            }

        }
    }
      class A implements Runnable{


        @Override
        public void run() {
            try {

                int b=new Random().nextInt(3);
                list.add(b);
                System.out.println(Thread.currentThread().getName()+"thread has to be wait until B thread completes"+b);
                cb.await();
                System.out.println(list);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
          //  System.out.println();
        }
    }
}
