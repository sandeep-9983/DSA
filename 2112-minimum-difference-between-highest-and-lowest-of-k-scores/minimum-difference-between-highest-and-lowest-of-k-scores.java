class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minimum=Integer.MAX_VALUE;
       for(int i=0;i+k-1<nums.length;i++){
        int dif=nums[i+k-1]-nums[i];
        minimum=Math.min(minimum,dif);
        

       }
       return minimum;
    }
}