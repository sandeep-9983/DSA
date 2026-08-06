class Solution {
    public int longestOnes(int[] nums, int k) {
       int chance;
       int max=0;
       int n=nums.length;
       int cnt;
       for(int i=0;i<n;i++){
        chance=k;
         cnt=0;
        for(int j=i;j<n;j++){
            if(nums[j]==1){
                cnt++;
            }else if(nums[j]==0&&chance!=0){
                cnt++;
                chance--;
            }else{
                break;
            }
            max=Math.max(max,cnt);

        }
       }
       return max;
    }
}