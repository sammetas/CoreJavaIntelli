package com.dynamicprogamming;

import java.util.HashMap;

/*
 given with an amounts array {1,2,3} can we generate 5 using the given coins or not
 */
public class KSumProb1 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int  k = 5;
        int a1[] = {6,4,10};
        int k1 = 15;
        System.out.println(kSumProb(a,k));
        System.out.println(kSumProb(a1,k1));
    }

    public static boolean kSumProb(int[] a, int k){
        HashMap<Integer,Integer> memo = new HashMap<>();
        for(int i=0; i < a.length ; i ++){
            int diff = Math.abs(a[i] - k);
            if(memo.containsKey(diff)) return true;
            memo.put(a[i],i);
        }
        return false;
    }
}
