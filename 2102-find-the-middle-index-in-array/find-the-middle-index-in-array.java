class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum;
        int rightsum;
        int l;
        int r;
        for(int i=0;i<nums.length;i++){
            leftsum=0;
            rightsum=0;
            l=0;
            r=i+1;
            while(l<i){
                leftsum+=nums[l];
                l++;
            }
            while(r<nums.length){
                rightsum+=nums[r];
                r++;
            }
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
        }
}