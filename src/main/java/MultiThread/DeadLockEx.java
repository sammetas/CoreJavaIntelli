package MultiThread;

public class DeadLockEx {
    public static void main(String[] args) {
  Lock l= new Lock();
 l.disp("samm","101");


        Thread t1= new Thread(){
            @Override
            public void run() {
                l.disp("ramm","102");
            }
        };
         t1.start();
    }
}


class Lock{
       String name;
       String id;

      public void disp(String name,String id){

          try {
              wait();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          synchronized (this.name){
            this.name=name;
         }


          // Thread.sleep(1000);

          synchronized (this.id){
            this.id=id;
       }
          notifyAll();
        System.out.println("Modified Values::"+this.name+" and id "+this.id );
    }
}

