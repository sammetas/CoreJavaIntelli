/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
class MaxProfileBuySellStocks {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int leastSoFar = Integer.MAX_VALUE;

        for(int i =0; i < prices.length; i++){
            if(prices[i] < leastSoFar){
                leastSoFar = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - leastSoFar);
        }
        return maxProfit;
        
    }

    public int maxProfitBruteForce(int[] prices){
        int max = Integer.MIN_VALUE;
        int  leastSofar = Integer.MAX_VALUE;
        int len = prices.length;
        for(int i =0; i < len;i++){
            for(int j = i+1; j < len; j++){
                if(prices[i] < leastSofar){
                    leastSofar = prices[i];
                }
                max = Math.max(max,(prices[i] - leastSofar));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices  = {7,1,5,3,6,4};
        System.out.println(new MaxProfileBuySellStocks().maxProfit(prices));
        System.out.println(new MaxProfileBuySellStocks().maxProfitBruteForce(prices));
    }
}