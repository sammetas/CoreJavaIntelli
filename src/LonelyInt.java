import java.util.*;

public class LonelyInt {

    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(new Integer[]{1,1,4,3,2,3,4,5,7,7,8,8});
        Map<Integer,Integer> map=new HashMap<>();
        list.stream().forEach(i -> {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        });

        System.out.print("Lonely element(s)::");
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.print(+entry.getKey()+", ");
            }

        }

    //    System.out.println(map);


    }

}
