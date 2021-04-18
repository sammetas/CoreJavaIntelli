import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOps {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        List<Integer> flatListEx1= Arrays.asList(2,4,6,8);
        List<Integer> flatListEx2= Arrays.asList(1,3,5,7,9);
        List<Integer> flatListEx3= Arrays.asList(11,13,17);
        list.add("small");
        list.add("case");

        System.out.println(flatListEx1.stream().reduce(0,(s1,s2)->s1+s2));

        List<String> newList=list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(newList);
          newList.forEach(s->System.out.println(s.toLowerCase()));

List<Integer> all=Stream.of(flatListEx1,flatListEx2,flatListEx3).flatMap(l->l.stream()).collect(Collectors.toList());
        System.out.println(all);

        //flatListEx1.stream().flatMap(l->l.stream().)
    }
}


