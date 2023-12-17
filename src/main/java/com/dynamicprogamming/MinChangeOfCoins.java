package com.dynamicprogamming;

import java.util.HashMap;

/*
  int a[] ={1,2,3} coins given , generate 4 cents using min cent coins.
 */
public class MinChangeOfCoins {
    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int amount = 4;
        System.out.println(minChange(coins, amount, new HashMap<Integer, Integer>()));
    }

    private static int minChange(int[] coins, int amount, HashMap<Integer, Integer> memo) {

        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        int minCoins = -1;
        for (int i = 0; i < coins.length; i++) {
            int subAmount = amount - coins[i];
            int subCoins = minChange(coins, subAmount, memo);
            if (subCoins != -1) {

                int numCoins = subCoins + 1;
                if (minCoins < numCoins || minCoins == -1) {
                    minCoins = numCoins;
                }
            }

        }
        memo.put(amount,minCoins);
        return minCoins;

    }
}
