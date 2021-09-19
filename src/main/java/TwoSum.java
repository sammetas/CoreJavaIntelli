import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[]{0,0};
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
         
           // int exp=target=nums[i];
            if(map.containsKey(nums[i])){
                return new int[]{i,map.get(nums[i])};
            }
            map.put(target-nums[i],i);
            
        }
    return res;
    }

    public static void main(String[] args) {
        int a[]={2,7,11,15 };
        int target=9;
        int res[]=new TwoSum().twoSum(a,target);
        System.out.printf("res::"+res[0]+"===="+res[1]);
    }
}