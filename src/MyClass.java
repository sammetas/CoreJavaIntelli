/*
NetCracker interview sample file
 */
public class MyClass {


    public void dispay(int a){
        System.out.println(a);
    }
    public void display (String a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        AddInter in=(a,b)->{return  a+b;};
        System.out.println(in.add(10,29));

        MyClass m= new MyClass();
          m.dispay(10);
          m.display("hello");

          //overriding

        A a= new A();
        A b= new B();
        System.out.println(a.display(10));
        System.out.println(b.display(10));


    }
}









class A{

    A(){}
    int display(int x){
        return  x*x;
    }

}

class B extends  A{

    int display(int x){
        return  x-2*x;
    }

}



@FunctionalInterface
interface  AddInter{
    int add(int x,int y);
}




