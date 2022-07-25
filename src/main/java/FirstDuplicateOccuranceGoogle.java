//https://www.youtube.com/watch?v=XSdr_O-XVRQ

import static java.lang.Math.max;
import static java.lang.Math.min;

public class FirstDuplicateOccuranceGoogle {
    public static void main(String[] args) {
     int a[] = {2,1,3,5,3,2};
// [1,0,2,4,2,1]
        int minIndex =Integer.MAX_VALUE;

     for(int i = 0; i < a.length; i++){
         for(int j=i+1 ; j< a.length;j++){

             if(a[i] == a[j]){

               minIndex = min(j,minIndex);
             }


         }
     }
        System.out.println(minIndex+1);
    }
}
