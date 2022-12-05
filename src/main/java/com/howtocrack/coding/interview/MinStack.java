package com.howtocrack.coding.interview;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        StackEx s = new StackEx();
        s.push(1);s.push(2);s.push(3);s.push(-10);s.push(13);
       // System.out.println(s.min());
     //   s.pop();s.pop();
        System.out.println(s.minV2());
    }
}


class StackEx{
    int data;
    int MIN_VALUE = Integer.MAX_VALUE;
    int SIZE = 20;
    int a[] = new int[SIZE];
    int count = -1;
    public void push(int data){
        if(count == SIZE){
            System.out.println("Stack Full");
            return;
        }

        a[++count] = data;
    //    MIN_VALUE = Math.min(MIN_VALUE,data);

    }

    public int min(){ return MIN_VALUE;}
    public int minV2(){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<count;i++){
            min = Math.min(min,a[i]);
        }
        return min;
    }

    public int pop(){
        if(count < 0){
            System.out.println("No elements");
            return -1;
        }
        int data = a[count--];
        //MIN_VALUE = Math.min(MIN_VALUE,data);
        return data;
    }
}
