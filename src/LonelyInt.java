import java.util.*;
/*
find the element that appeared only once in the array.
 */
public class LonelyInt {

    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(new Integer[]{1,1,4,3,2,3,4,5,7,7,8,8});
        Set<Integer> tSet= new HashSet<>();



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
// appy same to  a string . Lonely aplhabet

        //String str="applee";
        String str="114323457788";
        System.out.println();
        for(int i=0;i<str.length();i++){

            if(str.lastIndexOf(str.charAt(i))==str.indexOf(str.charAt(i))){
                System.out.print(str.charAt(i)+",");
            }
        }

    }

}
