import java.util.*;
import java.util.stream.Collectors;

public class RotateList {
    public static void main(String[] args) {
        //List<Integer> list = List.of(1,2,3,4,5);
        Queue queue = new ArrayDeque();
        queue.add(4);queue.add(3);queue.add(2);queue.add(100);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        int k =3;
        int n = list.size() ;
        List<Integer> newList = new ArrayList<>();
        int[] newArray = new int[list.size()];
        int counter = 0;
        for(Integer i:list){
            //newList.add((n - k + counter) %k,i);
         //   newArray[(n - k + counter)% list.size()] = i;
            list.add((n - k + counter)% n,i);
            counter ++;
        }
        System.out.println(list);

    }
}
