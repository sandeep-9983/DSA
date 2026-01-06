class Solution {
    public int maxProfit(int[] prices) {
        int maximumprofit=0;
        int buyprices=prices[0];
        for(int i=1;i<prices.length;i++){
            int currentprofit=prices[i]-buyprices;
            if(prices[i]<buyprices){
                    buyprices=prices[i];
                }
            if(currentprofit>maximumprofit){
                maximumprofit=currentprofit;
        
            }
        }
        return maximumprofit;
        
    }
}