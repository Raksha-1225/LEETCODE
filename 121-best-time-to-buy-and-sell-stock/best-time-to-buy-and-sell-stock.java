class Solution {
    public int maxProfit(int[] prices) {
        int a = prices[0];
        int p= 0;

        for (int i = 1; i < prices.length; i++) {
            if (a > prices[i]) {
                a = prices[i];
            }

            p = Math.max(p, prices[i] - a);
        }

        return p;        
    }
}