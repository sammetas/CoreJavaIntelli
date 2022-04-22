import java.util.*;
import java.util.stream.Collectors;

/*
  Sort the hash map by using value and java 8 features streams
  And you can do same code for sorting using key by changing one thing. Guess what?
 */
public class HashMapSortByValues {
    public static void main(String[] args)  {

         HashMap<String,Integer> map = new HashMap<>();

         for(int i=0;i<10;i++){
             map.put(""+i,new Random().nextInt(100));
         }
        System.out.println("Before Sort::"+map);

     Map<String,Integer> newMap=

         map.entrySet().stream().sorted((a,b)->a.getValue().compareTo(b.getValue()))
         .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(k1,k2)->k1,LinkedHashMap::new));
        System.out.println("After Sort"+newMap);

    }
}

