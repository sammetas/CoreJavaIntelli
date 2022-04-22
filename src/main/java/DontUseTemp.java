/*
  How to swap two variables without using a temp variable.
 */
public class DontUseTemp {

    public static void main(String[] args) {
    int a=10;
    int b=20;

    a+=b;
    b=a-b;
    a-=b;
        System.out.println("a="+a +","+"b="+b);

    }


}
