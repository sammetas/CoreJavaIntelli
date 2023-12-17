package com.dynamicprogamming;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class FibinociSeries {
    static int memory[];
    //static long memory1[];

    public static void main(String[] args) {
        int n = 6; //0 1 1 2 3 5 8 13
        memory = new int[n + 1];
        Arrays.fill(memory, -1);
        Instant startTime = Instant.now();
       // System.out.println("sum=" + findFibonacciNumberOf(n));
       // System.out.println("sum=" + findFibonacciInRecursive(n));
       // System.out.println("sum=" + findFibonacciUseDynamicProg(n, memory));
        System.out.println("sum=" + findFibonacciUseDynamicProgNonRecursive(n));
        Instant endTime = Instant.now();
        System.out.println(Duration.between(startTime, endTime));
    }


    private static int findFibonacciNumberOf(int n) {
        int f1 = 0;
        int f2 = 1;
        int sum = f1 + f2;
        while (n >= 2) {
            f1 = f2;
            f2 = sum;
            sum = f1 + f2;
            n--;
        }
        return sum;
    }

    private static int findFibonacciInRecursive(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else {
            return findFibonacciNumberOf(n - 1) + findFibonacciNumberOf(n - 2);
        }
    }

    private static int findFibonacciUseDynamicProg(int n, int[] memory) {

        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (memory[n] >= 0) {
            return memory[n];
        }
        memory[n] = findFibonacciUseDynamicProg(n - 1, memory) + findFibonacciUseDynamicProg(n - 2, memory);
        return memory[n];


    }

    private static long findFibonacciUseDynamicProgNonRecursive(int n) {


       long  memory1[] = new long[3];
        if (n <= 1) return n;
        memory1[1] = 1;
        for (int i = 2; i <= n; i++) {
            memory1[i%3] = memory1[(i - 1)%3] + memory1[(i - 2)%3];
        }

        return memory1[n%3];


    }
}
