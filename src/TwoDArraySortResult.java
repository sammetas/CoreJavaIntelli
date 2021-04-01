import java.util.*;
/*
solve below hackerrank problem of persistant systems
1. Create a two dimensanal array with list values and its elements frequencies
2. Sort it by Frequency in descending order
3 Then again sort by its values.
 */
public class TwoDArraySortResult {

    public static void main(String[] args) {
List<Integer> new2= new LinkedList<>();
        List<Integer> new1= new ArrayList<>();


        List<List<Integer>> finalList= new ArrayList<>();
        List<Integer> orgList= Arrays.asList(new Integer[]{1,3,5,2,1,2,5,2,1,7,7,23,48,2,3,4});

        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer i:orgList){
            map.put(i, Collections.frequency(orgList,i));
        }
        System.out.println(map);
        //sort by values
          ArrayList<Map.Entry<Integer,Integer>> entryList= new ArrayList<>(map.entrySet());
         Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
             @Override
             public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                 return o2.getValue().compareTo(o1.getValue());
             }
         });
        System.out.println("after sort"+entryList);

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println("Again sorted::"+entryList);

        for(Map.Entry<Integer,Integer> entry:entryList){
            List<Integer>    tList=new ArrayList<Integer>();
            tList.add(entry.getKey());
            tList.add(entry.getValue());
            finalList.add(tList);
        }
        System.out.println(finalList);
    }
}
