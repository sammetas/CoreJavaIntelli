import java.util.Arrays;

/*
Binary search using recursion
 */
public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,7,5,3,7,8,};
        Arrays.sort(a);
       int searchElementM= searchElementM(a,71);

        if(searchElementM==-1)
            System.out.println("Not found");else System.out.println("Found at "+searchElementM+ " Position");

    }

    private  static  int searchElementM(int a[],int k){

         return  bsearch(a,0,a.length-1,k);


    }

    private static int bsearch(int[] a, int i, int j,int k) {

        if(j>=i) {
            int mid = (i + j) / 2;

            if (k > a[mid]) {
                bsearch(a, mid+1, j, k);
            } else if (k < a[mid]) {
                bsearch(a, 0, mid-1, k);
            } else if(a[mid]==k){
                return mid;
            }
        }
        return -1;
    }
}
