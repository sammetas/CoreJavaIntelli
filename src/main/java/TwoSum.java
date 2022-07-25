import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[]{0,0};
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
         

            if(map.containsKey(nums[i])){
                return new int[]{i,map.get(nums[i])};
            }
            map.put(target-nums[i],i);
            
        }
    return res;
    }

    public static void main(String[] args) {
        int a[]={528 ,129 ,376 ,504 ,543, 363 ,213 ,138 ,206 ,440 ,504 ,418 };
        List<Integer> revL =  Arrays.asList(528 ,129 ,376 ,504 ,543, 363 ,213 ,138 ,206 ,440 ,504 ,418 );
        Collections.sort(revL)	;
        for(int i=0;i<revL.size();i++){
                a[i] = revL.get(i);
        }
        int target= Arrays.asList(528 ,129 ,376 ,504 ,543, 363 ,213 ,138 ,206 ,440 ,504 ,418).stream().reduce(0,(a1,b)->a1+b)/2;
        System.out.println(target);
        int res[]=new TwoSum().twoSum(a,target);
        System.out.printf("res::"+res[0]+","+res[1]);
    }
}