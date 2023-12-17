import java.util.Arrays;
import java.util.Collections;

public class SortArraysAgain {
    public static void main(String[] args) {
        int a1[] ={1,93,4,83,6};
        int a2[] = {8,52,142,9,364};

        Arrays.sort(a1);
        Arrays.sort(a2);

        int result[] =new int[a1.length+a2.length];
        int i = 0; int j=0;
        int k=0;
         while (i < a1.length && j < a2.length){

             if(a1[i] < a2[j]){
                 result[k++] = a1[i++];
             }else {
                 result[k++] = a2[j++];
             }

        }

             while (i < a1.length){
                 result[k++] = a1[i++];
             }
             while (j < a2.length){
                 result[k++] = a2[j++];
             }

             for(int ii=0;ii<result.length;ii++){
                 System.out.print(result[ii]+",");
             }

    }
}
