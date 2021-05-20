package MultiThread;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockSimulation {
    public static void main(String[] args) {
        Lock lock1=new ReentrantLock();
        Lock lock2=new ReentrantLock();

        new Thread(new Runnable1(lock1,lock2)).start();
        new Thread(new Runnable2(lock2,lock1)).start();



    }
}



class Runnable1 implements Runnable{

    java.util.concurrent.locks. Lock lock1;
    java.util.concurrent.locks. Lock lock2;

    Runnable1(Lock lock1,Lock lock2){
        this.lock1=lock1;
        this.lock2=lock2;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+" trying to acquire lock1");
            lock1.lock();
          //  Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" trying to acquire lock2");
          //  lock2.lock();
            if(!lock2.tryLock()){
                lock1.tryLock(2000,TimeUnit.MILLISECONDS);
            }
        }catch (Exception e){

        }finally {
            lock1.unlock();

            lock2.unlock();
        }
    }
}

class Runnable2 implements Runnable{

    java.util.concurrent.locks. Lock lock1;
    java.util.concurrent.locks. Lock lock2;

    Runnable2(Lock lock1,Lock lock2){
        this.lock1=lock1;
        this.lock2=lock2;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+" trying to acquire lock2 which is already"+lock2.tryLock()+" by Other thread");
            //synchronized (this){
            lock2.lock();//}
          //  Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" trying to acquire lock1 which is already"+lock1.tryLock()+" by Other thread");
            if(!lock1.tryLock()){
                lock1.tryLock(2000,TimeUnit.MILLISECONDS);
            }

        }catch (Exception e){

        }
        finally {
            lock2.unlock();
            lock1.unlock();

        }
    }
}