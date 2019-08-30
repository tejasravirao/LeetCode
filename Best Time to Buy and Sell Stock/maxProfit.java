// Tejas Ravi Rao
// Link => https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        
        int maxval = 0;
        int minval= Integer.MAX_VALUE;
        
        for (int i=0;i<prices.length;i++){
            if(prices[i]<minval){
                minval=prices[i];
            }
            else if(prices[i]-minval > maxval){
                maxval = prices[i]-minval;
        }
            }
        return maxval;
    }
}
