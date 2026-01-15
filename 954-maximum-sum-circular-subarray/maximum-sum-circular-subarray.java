class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ms=nums[0];
        int currsummax=nums[0];
        int n=nums.length;
        int mins=nums[0];
        int currsummin=nums[0];
        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            total+=nums[i];
            currsummax=Math.max(nums[i],currsummax+nums[i]);
            ms=Math.max(currsummax,ms);
            currsummin=Math.min(nums[i],currsummin+nums[i]);
            mins=Math.min(currsummin,mins);
        }
            if(ms<0){
                return ms;
            }
        return Math.max(ms,total-mins);
      
    }
}