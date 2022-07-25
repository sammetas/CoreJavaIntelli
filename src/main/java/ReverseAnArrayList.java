import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
  how to reverse an array list.
  1. using collections.reverse()
  2. Using same COllections.swap() method
  3. implementing same collections.swap here
 */
import static java.util.Collections.swap;

public class ReverseAnArrayList {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,9,8,7,1,2,3,4,5);
        int i;int j;
        for( i=0, j=list.size()-1;i<j;i++,j--){
           //swap(list,i,j);
            swapHere(list,i,j);
        }
       //Collections.reverse(list);
        System.out.println(list);
    }

    private static void swapHere(List<Integer> list, int i, int j) {
        list.set(j,list.set(i,list.get(j)));
    }
}
