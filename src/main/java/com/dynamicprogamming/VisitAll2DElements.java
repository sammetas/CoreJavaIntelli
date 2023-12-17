package com.dynamicprogamming;

public class VisitAll2DElements {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(visitAll(arr,0,0));
    }

    private static int visitAll(int[][] arr,int c,int r) {
        if ( r == arr.length-1 && c == arr[r].length-1){
            return 1;
        }else if(r == arr.length || c == arr[r].length) {
            return 0;
        }
        return  visitAll(arr,c,r+1) + visitAll(arr,c+1,r);

    }
}
