class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }}
            if(idx==-1){
                reverse(nums);
                return ;
            }
            for(int i=n-1;i>=idx;i--){
                if(nums[idx]<nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                    break;
                }
            }
                Arrays.sort(nums,idx+1,nums.length);
    }
      public void reverse(int [] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
      }
        
    }
