//https://www.youtube.com/watch?v=XSdr_O-XVRQ
/*
   find out the first duplicate number for which the second occurrence has minimal index.

 */

import static java.lang.Math.max;
import static java.lang.Math.min;

public class FirstDuplicateOccuranceGoogle {
    public static void main(String[] args) {
     int a[] = {2,1,3,5,3,2}; //inside values are always bw 0 to a.length
// [1,0,2,4,2,1]
        int minIndex = a.length;

     for(int i = 0; i < a.length; i++){
         for(int j=i+1 ; j< a.length;j++){

             if(a[i] == a[j]){

               minIndex = min(j,minIndex);
             }


         }
     }
        System.out.println(a[minIndex]);
    }
}
