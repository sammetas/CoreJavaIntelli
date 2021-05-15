import java.util.*;
import java.util.stream.Collectors;
/*
1.convert a list to map
2.Find the max length word using streams
3.Sum all words and find its length
4.Sort all words by its length
 */
public class ListToMapEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "xyz", "pqr", "sort", "all", "by", "its", "length");

        System.out.println(list.stream().collect(Collectors.toMap(String::toString, String::length)));
        //2.
        System.out.println(list.stream().max(Comparator.comparing(s -> s.length())).get());
        //3.
        System.out.println(list.stream().reduce((s1, s2) -> {
            return s1 + s2;
        }).get());
        //4.
HashMap<String,Integer> amap= new HashMap<>();

        //System.out.println(
                LinkedHashMap<String,Integer> linkedHashMap=list.stream().collect(Collectors.toMap(String::valueOf, String::length))
                .entrySet()
                .stream().sorted((o1, o2) -> {

            return o2.getValue().compareTo(o1.getValue());
        }).collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e2,LinkedHashMap::new));
        //);
        System.out.println(linkedHashMap);

    }

}
