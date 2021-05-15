import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapnMap {
    public static void main(String[] args) {

        List<Integer> l1=new ArrayList<>();List<Integer> l2=new ArrayList<>();List<Integer> l3=new ArrayList<>();
        l1.add(10);l1.add(20);
        l2.add(11);l2.add(13);l2.add(14);
        l3.add(211);l3.add(113);l3.add(114);
        HashMap<String, List<Integer>> map=new HashMap<>();
         map.put("one",l1);map.put("two",l2);map.put("three",l3);
        List<Integer> newList=new ArrayList<>();
         List<List<Integer>> l =map.values().stream().flatMap(Stream::of).collect(Collectors.toList());


    }
}
