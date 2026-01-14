class Solution {
    public int maxSubArray(int[] nums) {
        int ms=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
        currentsum=Math.max(nums[i],nums[i]+currentsum);
        ms=Math.max(currentsum,ms);
        }
        return ms;
    }
}