class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k=Integer.MIN_VALUE;
        for(int pile:piles){
            k=Math.max(k,pile);
        }
        int low=1;
        int high=k;
        while(low<=high){
            int mid=low+(high-low)/2;
           long hrs=0;
           for(int pile:piles){
            if(pile%mid==0){
                hrs+=pile/mid;
            }else{
                hrs+=pile/mid+1;
            }
           }

           if(hrs<=h){
            high=mid-1;
           }else{
            low=mid+1;
           }
        }
        return low;
    }
}