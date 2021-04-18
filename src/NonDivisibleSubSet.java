import java.util.*;

public class NonDivisibleSubSet {

    public static void main(String[] args) {
        int a[]={19,10,12,10,24,25,22};
        //int a[]={1,7,2,4};
       int k=4;
//        int k=3; //ans:: {1,7,4} ::3

         List<Integer> list=Arrays.asList(new Integer[] {19,10,12,10,24,25,22});

        int max=findMaxSubsetNonDiv(k,list);
        System.out.println(max);
    }

    private static int findMaxSubsetNonDiv(int k,List<Integer> s )  {
        Set<Integer> aset= new HashSet<>();
        int count=0,maxCount=0;
        int j=0;
        for(int i=0;i<s.size();i++) {

            if(findSuasetmDivisible(s.get(i),k,aset)){
                aset. add(s.get(i));
            }

        }
        System.out.println(aset);
        return aset.size();
    }

    private static boolean findSuasetmDivisible(int i, int k,Set<Integer> aset) {

        if(aset.isEmpty()){
          return true;
        }

        Iterator<Integer> it=aset.iterator();

        while (it.hasNext()) {

            if ((i + it.next()) % k == 0) {
                return false;
            }
        }
    return true;
    }
}
