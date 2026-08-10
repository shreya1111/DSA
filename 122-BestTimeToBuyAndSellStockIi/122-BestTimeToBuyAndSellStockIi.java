// Last updated: 10/08/2026, 23:56:08
class Solution {
    public int maxProfit(int[] prices) {
        
          int max_Profit=0;
          for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                max_Profit+=prices[i]-prices[i-1];
            }
          }
          return max_Profit;

    }
    
}