class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int curr=0;
        int avg=0;
        int sum=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            curr=nums[i];
            sum=0;
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
            }
            avg=sum/(n-1-i);
            if(curr>avg){
                count++;
            }
            
            
        }
        return count;
    }
}