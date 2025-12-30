class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        if(nums.length<=2){
            return nums.length;
        }
        for(int j=0;j<nums.length;j++){
            if(i<2||nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
        
    }
}