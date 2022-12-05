package com.howtocrack.coding.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*two sorted lists are given , find common elements.
   lista = {1,4,5,6,7,8,90,143}
   listb = {4,7,9,10,12,90,150}
 */
public class CommonEleInTwoLists {
    public static void main(String[] args) {
      //  List<Integer> a = Arrays.asList(1,4,5,6,7,8,90,143);
      //  List<Integer> a = Arrays.asList(1,4,5,6,7,8,90,143);
        List<Integer> a = Arrays.asList(13,27,35,40,49,55,59);
        List<Integer> b = Arrays.asList(17,35,39,40,55,58,60);
        //approach -1 O(N2)
        System.out.println("common eles are:");
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                if(Objects.equals(a.get(i), b.get(j))){
                    System.out.print(a.get(i)+",");
                }
            }
        }
        //approach -2 O(N log N)
        System.out.println();
        for(int i=0;i<a.size();i++){
            if(Arrays.binarySearch(b.toArray(),a.get(i)) >= 0){
                System.out.print(a.get(i)+",");
            }
        }

        //approach -3 . Take the advantage of the sorted Arrays.
        System.out.println();
         int k = 0;
         for(int i =0 ;i<a.size();i++){
             if(a.get(i) >= b.get(k)){
                 if(Arrays.binarySearch(b.toArray(),a.get(i)) >=0 ){
                     System.out.print(a.get(i)+",");k++;
                 }
             }
         }





    }
}
