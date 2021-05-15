
interface  FunInter{
    public int getSum(int a,int b);
}

  class BeforeLambda1 implements FunInter{

    int x = 10;
    int y = 20;
    int z;

      BeforeLambda1(){}
    public   BeforeLambda1(int x,int y) {
       this.x=x;
       this.y=y;
    }

      @Override
      public int getSum(int a, int b) {
          return a+b;
      }
      public  void print(){
          System.out.println(z);
      }
  }
public class BeforeLambda {

    int x=10;int y=20;
int z;

    public static void main(String[] args){

        FunInter b4lamda=new BeforeLambda1(){
            @Override
            public int getSum(int a, int b) {
                return super.getSum(a, b);
            }
        };

        System.out.println(b4lamda.getSum(120,4));
    }


}
