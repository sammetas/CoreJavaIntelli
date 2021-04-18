import java.util.Arrays;
import java.util.Collections;

/*
Swap min elemetns to sort array
 */
public class MinSwapsInArrayToSort {
    public static void main(String[] args) {
int count=0;
        int a[]={7,1,3,2,4,5,6}; //asn min moved: 5
     //   int a[]={4,3,1,2}; //asn min moved: 3
        int sorted[]=a.clone();
         Arrays.sort(sorted);
//        int s[]={1,2,3,4,5,6,7};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(a[i]>a[j] && !bothSame(a,sorted)){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                    System.out.println("(i,j)"+"("+i+","+j+")");
                    count++;
                }
            }
        }

        System.out.println(count);
        for (int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }

    }

    private static boolean bothSame(int[] a, int[] sorted) {

        for(int i=0;i<a.length;i++){
            if(a[i]!=sorted[i])
                return false;
        }
        return true;
    }
}
