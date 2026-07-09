class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum;
        double max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<=n-k;i++){
            sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            max=Math.max(max,(double)sum/k);
            
        }
        return max;
        
        
    }
}