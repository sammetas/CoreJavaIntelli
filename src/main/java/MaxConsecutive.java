import java.util.ArrayList;
import java.util.Arrays;

/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.



Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 */
public class MaxConsecutive {
    public static void main(String[] args) {
        int []nums = {1,1,1,0,0,0,1,1,1,1,0}; int k = 2;
        System.out.println(longestOnes(nums,k));

    }


    public static int longestOnes(int[] nums, int k) {


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            int t1 = i;
            while (nums[t1] == 1 && t1 < nums.length - 1) {
                t1++;
            }
            int t2 = k;
            while (nums[t1] == 0 && t2 >= 0) {
                t2--;
            }


            max = Math.max(max, nums.length -  t1 -k);

        }

        return max;
    }

}