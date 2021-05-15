public class Fibonacci {
    public static void main(String[] args) {
        int fibSum=fibonoic(9); // 0 1 1 2 3 5
        System.out.println(fibSum);
    }

    private static int fibonoic(int n) {

        if(n<=1)
            return n;


            return fibonoic(n-1)+fibonoic(n-2);
    }
}
