public class SumRecursively {
    public static void main(String[] args) {
        int a[] = {1,3,5,7,9,11,13,15,17,19,21,23};
        int res = 0;
        int sum = sumUp(a,a.length-1);
        System.out.println(sum);
    }

    private static int sumUp(int[] a,int n) {
        if(n<0) return 0;
        return a[n] + sumUp(a,n-1);
    }
}
