class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           int  currsum=0;
            for(int j=i;j<n;j++){
                currsum+=nums[j];
                if(currsum==k){
                    cnt++;
                }
            }
        
        }
        return cnt;
    }
}