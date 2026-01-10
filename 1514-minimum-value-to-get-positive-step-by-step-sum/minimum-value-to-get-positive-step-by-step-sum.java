class Solution {
    public int minStartValue(int[] nums) {
      
        int minimum=0;
       int sum=0;
        for(int start=0;start<nums.length;start++){
            sum+=nums[start];
             minimum=Math.min(sum,minimum);

        }
    
      return Math.max(1,1-minimum);
        
    }
}