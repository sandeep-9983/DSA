class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max=0;
        int base=0;
        int extra=0;
        int l=0;
        for(int r=0;r<grumpy.length;r++){
            if(grumpy[r]==0){
                base+=customers[r];
            }else{
                extra+=customers[r];
            }
            if(r-l+1>minutes){
                 if (grumpy[l] == 1) {
                    extra -= customers[l];
                }
                l++;}
                max=Math.max(max,extra);
        }
        return max+base;
        
    }
}