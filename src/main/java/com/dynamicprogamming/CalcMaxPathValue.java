package com.dynamicprogamming;

import java.util.HashMap;
import java.util.List;

public class CalcMaxPathValue {
    public static void main(String[] args) {
        int a[][] = {{1,3,12},{5,6,2}}; //expected output will be 1+3+12+2= 18 (path that is with max sum)
        int a1[][] = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        System.out.println(countMaxValuePath(a1,0,0, new HashMap<>()));
    }

    private static int countMaxValuePath(int[][] a, int r, int c, HashMap<List<Integer>, Integer> memo) {

        if(r == a.length-1 && c == a[r].length-1){
            return  a[r][c];
        }
        if(r == a.length || c == a[r].length){
            return Integer.MIN_VALUE;
        }
        List<Integer> pos = List.of(r,c);
        if(memo.containsKey(pos)){
            return memo.get(pos);
        }
        int max = a[r][c] + Math.max( countMaxValuePath(a,r+1,c,memo) , countMaxValuePath(a,r,c+1,memo));
        memo.put(pos,max);
        return max;
    }
}
