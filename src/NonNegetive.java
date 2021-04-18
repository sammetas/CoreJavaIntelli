import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class NonNegetive {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(new Integer[]{1,2,3,4,5,-1,-2});

        System.out.println(list);

        for(int i=0;i<list.size();i++){
            if(!list.contains(-list.get(i))){
                System.out.println(list.get(i));
            }
        }
    }
}
