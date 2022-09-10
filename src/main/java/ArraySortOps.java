

public class ArraySortOps {
    public static void main(String[] args) {
        int a[] = {3,2,1,7,5,6};
       int k = 3;
        System.out.println(k);
       rotate(a,0,k-1);
        rotate(a,k,a.length-1);
        rotate(a,0, a.length-1);
        print(a);

    }

    private static void print(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        } System.out.println();
    }

    private static void rotate(int[] a, int l, int r) {
         if(l>= a.length || r<0) return;
        while (l<r ){
            if(a[l] > a[r]) {
                int t = a[l];
                a[l] = a[r];
                a[r] = t;
            }
            l++;
            r--;

        }   print(a);
    }
}
