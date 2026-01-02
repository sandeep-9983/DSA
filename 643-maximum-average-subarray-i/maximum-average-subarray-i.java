class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        double average=0;
        double max=Integer.MIN_VALUE;
         double sum=0;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            if(end-start+1==k){
                average=sum/k;
                max=Math.max(max,average);
                sum-=nums[start];
                start++;


            }

        }
        return max;
        
    }
}