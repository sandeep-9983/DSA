class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int bp=prices[0];
        int currmax=0;
        
        for(int i=1;i<prices.length;i++){
            int cp=prices[i]-bp;
            if(prices[i]<bp){
                bp=prices[i];
            }
           currmax=Math.max(currmax,cp);
            if(currmax>max){
                max=currmax;
            }
    


        }
return max;
        
    }
}