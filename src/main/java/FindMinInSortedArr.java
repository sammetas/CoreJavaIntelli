//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class FindMinInSortedArr {
    public static void main(String[] args) {
        int a[] = {3,4,5,1,2} ;//1,2,3,4,5
        System.out.println(findMin(a));
    }
    public static int findMin(int[] nums) {
      
        int i=0;
        int j=nums.length-1;
        
        while(i<j){
            int mid = (i+j)/2;
            if(nums[mid] > nums[j]){
              i = mid + 1;
            }else {
                j = mid;
            }
        }
        return nums[i];
        
    }
}  
