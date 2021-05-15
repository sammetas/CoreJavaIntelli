import java.util.*;
import java.util.stream.Collectors;

/*
  Every time the new score comes we need to adjust existing score board/map
  as per their score and ranks.
  1.same score -->equal rank. highest is rank 1.
 */
public class ClimbLeaderBoard {
    public static void main(String[] args) {
List<Integer> ranked= Arrays.asList(new Integer[]{100,90,90,80,75,60});
        List<Integer> player= Arrays.asList(new Integer[]{50,65,77,90,102});

        Map<Integer, Integer> mapT = new TreeMap<>((a, b) -> 1);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>((a, b) -> 1);

        List<Integer> ranks=new ArrayList<>();

        int i=1;
        for(Integer t:ranked){
            if(mapT.containsValue(t)){
                mapT.put(--i,t);
            }else{
                mapT.put(i,t);
            }i++;

        }




        //System.out.println(mapT);

       // System.out.println(mapT);
       Map<Integer,Integer> map=sortWithDupes(mapT);
        System.out.println(map);

        for(Integer t:player){
            int rank=getRank(map,t);
            map.put(rank,t);

        }
        System.out.println(map);
    }



    private static int getRank(Map<Integer, Integer> map, Integer t) {
        int key=0;
        if(map.containsValue(t)){

            Set<Map.Entry<Integer,Integer>> set=map.entrySet();
            for (Map.Entry<Integer,Integer> entry:set){
                if(entry.getValue().equals(t)){
                    key=entry.getKey();break;
                }
            }

        }else {
            int size= 0;
            Set<Map.Entry<Integer,Integer>> set=map.entrySet();
            for (Map.Entry<Integer,Integer> entry:set){
                System.out.println("sizz"+set.size());
                if(set.size()-1==size++){
                    System.out.println("nevercoming");
                     key=entry.getKey()+1;
                }
            }

        }
        return  key;
}


    private static Map<Integer, Integer> sortWithDupes(Map<Integer, Integer> mapT) {

        Map<Integer, Integer> map = mapT.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (x, y) -> x, () -> new TreeMap<>((a, b) -> 1)
                ));
        return     map;
    }


}

