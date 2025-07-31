class Solution {
    public int maxProfit(int[] prices) {
      int minprices=prices[0];
      int maxprofit=0;  
      for(int i=0;i<prices.length;i++){
        if(minprices < prices[i]){
            int profit=prices[i]-minprices;
            maxprofit=Math.max(maxprofit,profit);
        

        }else{
            minprices= Math.min(minprices , prices[i]);
        }
      }
      return maxprofit;
    }
}