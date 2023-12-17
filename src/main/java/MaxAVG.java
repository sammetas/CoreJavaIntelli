class MaxAVG {
    public static double findMaxAverage(int[] nums, int k) {
       return _findMaxAverage(nums,0,k);
    }

    private static double _findMaxAverage(int[] n, int index , int k){

        if (index > n.length - k){
            return 0;
        }

       double sum =0; int j = index;
        for(int i= 0; i < k; i++){
            sum += n[j++];
        }
      sum /= k;
        return Math.max(sum,_findMaxAverage(n,index + 1,k));

    }

    public static void main(String[] args) {
        int[] a={1,12,-5,-6,50,3}; int k = 4;
        int[] a1 ={0,1,1,3,3};
       // System.out.println(findMaxAverage(a,k));
        System.out.println(findMaxAverage(a1,k));
    }
}

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int averageSum = 0;
        for(int i =0 ; i< k ; i ++){
            averageSum += nums[i];
        }
        int maxSum = averageSum/k;
        for(int i  = k; i < nums.length; i++){
            averageSum += nums[i] - nums[i - k] ;
            maxSum = Math.max(averageSum,maxSum);
        }

        return maxSum/k;


    }

}