import java.util.Arrays;



public class MergeSort {
    public static void main(String[] args) {
        int n[] = {100,50,-3,-1,0,83};



         mergeSort(n,0,n.length - 1);
         for (int a: n){
             System.out.print(a+" ,");
         }

    }

    private static void mergeSort(int[] n, int i, int j) {

        if (i < j) {
            int mid = (i + j) / 2;
            mergeSort(n, i, mid);
            mergeSort(n, mid + 1, j);
          merge(n, i, mid, j);

        }
    }

    private static int[] merge(int[] n , int start, int mid , int end){
        int[] temp = new int[end - start + 1];
         int i = start;
         int j = mid + 1;
         int k =0;
        while (i <= mid &&  j <= end) {
            if (n[i] <= n[j]) {
                temp[k++] = n[i++];
            } else {
                temp[k++] = n[j++];
            }
        }

            while (i <= mid){
                temp[k++] = n[i++];
            }

            while(j <= end){
                temp[k++] = n[j++];
            }

        for(i = start;i <= end;i++){
            n[i] = temp[i - start];
        }
         return  n;
    }
}
