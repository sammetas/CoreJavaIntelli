import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
  Merge two sorted arrays.
  1. Failed: Duplicate values are missing.
  Expected : 1,3,3,4,5,6,8,15,81
 */

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] a1  = {6,3,5,8};
        int[] a2  = {5,3,1,4,15,81};

        List<Integer> list1 = Arrays.asList( 6,3,5,8);
        List<Integer> list2 = Arrays.asList( 5,3,1,4,15,81);

        //list1.sort((o1, o2) -> o1.compareTo(o2));
      //  list2.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println(list1 +" - "+list2);

        List<Integer> list3 = Stream.of(list1,list2).flatMap(Collection::stream).collect(Collectors.toList());
        list3.sort(Integer::compareTo);
        System.out.println(list3);
        Map<Integer,Integer> map = new TreeMap<>();
        map=list3.stream().sorted(Integer::compareTo)
                            .collect(Collectors.toMap(Integer::intValue,Integer::intValue,
                                    (integer, integer2) -> integer2+1,TreeMap::new));
        System.out.println(map);
    }
}
