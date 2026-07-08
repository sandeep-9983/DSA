class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        for(int i=0;i<n;i++){
            prefix[i]=i==0?nums[i]:prefix[i-1]+nums[i];
        }
return prefix;
    }
}