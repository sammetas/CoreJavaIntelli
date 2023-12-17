import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import static java.lang.Math.abs;

/*
Input: {1,2,5,3,9,7}. target = 2
the absolute diff between any two array elements should be 2.
Output: (1,3) ,(5,7),(9,7) ,(5,3) = 4
 */
public class ArrayDiffTarget {
    public static void main(String[] args) {
        int a[]={1,2,5,3,9,7,12,10};
        int k=2;
        System.out.println(getGrouplets(a,k)); //Brute Force
        //Optimized solution
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 9, 7, 12, 10));
        int countOpt = 0;
        for(int i=0;i<a.length;i++){
            if(list.contains(a[i]-k)) countOpt++;
        }
        System.out.println(countOpt);



    }

    public static int getGrouplets(int[] a,int k){
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(abs(a[i]-a[j])==k){
                    count++;
                    System.out.println("("+a[i]+","+a[j]+")");
                }
            }
        }
        return count;
    }
}



