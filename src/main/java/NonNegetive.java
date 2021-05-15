import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonNegetive {
    public static void main(String[] args) {
    //int a[]= new int[3];
        int a[]={1,2,3,4,-4,5,7,-9,9};

List<Integer> list= new ArrayList<>();

        Arrays.stream(a).forEach(list::add);
        Collections.sort(list,Collections.reverseOrder());


        for(int i=0;i<list.size();i++){
            if(list.get(i)>0 && list.contains(-list.get(i))){
                System.out.println(list.get(i));
            }
        }
    }
}
