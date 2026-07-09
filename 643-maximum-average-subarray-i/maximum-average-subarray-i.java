class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double max=Integer.MIN_VALUE;
        int n=nums.length;
        int left=0;
        for(int right=0;right<n;right++){
           sum+=nums[right];
           if(right-left+1==k){
            max=Math.max(max,(double)sum/k);
            sum-=nums[left];
            left++;

           }

        }
        return max;
        
        
    }
}