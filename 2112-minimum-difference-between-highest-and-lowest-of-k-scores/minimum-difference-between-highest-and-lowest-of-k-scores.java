class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minimum=Integer.MAX_VALUE;
        int start=0;
        for(int end=0;end<nums.length;end++){
            if(end-start+1==k){
              int difference=nums[end]-nums[start];
              minimum=Math.min(minimum,difference);
             start++;
            }
        }

       
       return minimum;
    }
}