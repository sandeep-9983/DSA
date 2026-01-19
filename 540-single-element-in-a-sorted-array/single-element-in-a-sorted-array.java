class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int n=nums.length;
        int low=0,high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    low=mid+2;
                }else{
                    high=mid;
                }

            }
            else{
                if(nums[mid]==nums[mid-1]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return nums[low];
        
    }
}