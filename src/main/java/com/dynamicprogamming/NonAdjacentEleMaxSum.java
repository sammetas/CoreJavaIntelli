package com.dynamicprogamming;
/*
Given an array of {2,4,5,12,7} we should sum up only non adjacent elements and get the max of those.
output: 16 (4+12)
 */
public class NonAdjacentEleMaxSum {
    public static void main(String[] args) {
        int a[] = {2,4,5,12,7};
        //int maxSum = getMaxSum(a);
       // System.out.println(maxSum);
        System.out.println(recursiveNonAdjacentEleMaxSum(a,0));
    }

    private static int getMaxSum(int[] a) {
        int maxSum =  Integer.MIN_VALUE;

        for(int i = 0; i<a.length; i++){
            int sum =0;
            for(int j = i ; j < a.length; j = j+2){
                if(j != i+1 ){
                    sum += a[j];
                }
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }

    private static int recursiveNonAdjacentEleMaxSum(int[] a,int index){

        if(index >= a.length) return 0; //base;

         return Math.max(a[index]+ recursiveNonAdjacentEleMaxSum(a, index + 2),recursiveNonAdjacentEleMaxSum(a,index + 1));

    }
}
