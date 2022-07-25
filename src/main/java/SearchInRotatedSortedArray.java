class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int a[] = {3,4,5,1,2} ;//1,2,3,4,5
        System.out.println(findMin(a,3));
    }
    public static int findMin(int[] nums, int tobeSearched) {
      
        int i=0;
        int j=nums.length-1;
        int mid = 0;
        while(i<j){
              mid = (i+j)/2;
            if(nums[mid] > tobeSearched){
              i = mid + 1;
            }else if(nums[mid] < tobeSearched) {
                j = mid-1;
            }else {
                return  mid;
            }
        }
        return -1;
        
    }
} 