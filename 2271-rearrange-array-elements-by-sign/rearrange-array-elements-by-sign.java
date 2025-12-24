class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ps=0,ng=1;
         int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[ng]=nums[i];
                ng+=2;


            }else{
                ans[ps]=nums[i];
                ps+=2;

            }
        }
        return ans;
       
    }
}