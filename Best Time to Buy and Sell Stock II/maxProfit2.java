// Tejas Ravi Rao
// Link => https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/


class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length <=0){
            return 0;
        }       
        
        int b0 = -prices[0];
        int b1 = b0;        
        int s0 =0, s1=0, s2=0;
        
        for(int i = 1; i<prices.length; i++){
            
            b0 = Math.max(b1, s1 - prices[i]);
            s0 = Math.max(s1, b1 + prices[i]);
            
            b1 = b0;             
            s1 = s0;             
        }
        
        return s0;
        
        
//         int max = 0;
        
//         for(int i =1 ; i <prices.length; i++ ){
            
//             if(prices[i]>prices[i-1]){
                
                
//             max = max + prices[i] - prices[i-1];
                
//             }
            
//         }
        
        
//         return max;     
        
    }
}