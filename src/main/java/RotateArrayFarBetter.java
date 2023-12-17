import java.util.Arrays;

public class RotateArrayFarBetter {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 4;
        k = k % a.length ;
        int l = a.length-k;
        reverse(a,0,l-1);
        reverse(a,l,a.length-1);
        reverse(a,0,a.length-1);

         for(int i=0;i<a.length;i++){
             System.out.print(a[i]+",");
         }


    }

    private static void reverse(int[] a, int i, int k) {
  if(a == null || a.length == 1) return;
        while (i < k){
            int t = a[i];
            a[i] = a[k];
            a[k] =  t;
            i++;k--;
        }

    }

}
