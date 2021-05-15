import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UniqueName {
    public static String firstUniqueName(String[] names) {
        List<String> list =Arrays.asList(names);

        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();

        for(String a:list){
            if(map.containsKey(a)) {
                map.put(a, map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
      for(Map.Entry<String,Integer> entry:map.entrySet()){

          if(entry.getValue()==1){
              return entry.getKey();
          }

      }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }
}