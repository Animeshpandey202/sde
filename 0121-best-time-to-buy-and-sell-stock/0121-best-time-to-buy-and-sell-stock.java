class Solution {
    public int maxProfit(int[] prices) {
        
        //ek min buy mainitain kro and try to sell on ith day....maintain max profit
        
        int profit=0;
        int buy=9999999;
        
        for(int i=0;i<prices.length;i++){
            
            buy=Math.min(prices[i],buy);
            
            profit=Math.max(profit,prices[i]-buy);
            
            
        }
        
        return profit;
        
        
    }
}