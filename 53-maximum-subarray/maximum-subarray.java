class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max=nums[0];
        int cs=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cs<0){
                cs=nums[i];

            }else{
                cs+=nums[i];
            }
            max=Math.max(cs,max);

        }
        return max;
    }
}