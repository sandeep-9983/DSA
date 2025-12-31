class Solution {
    public int[] sortedSquares(int[] nums) {
     int n=nums.length;
     int temp[]=new int [n];
     for(int i=0;i<n;i++){
        nums[i]=nums[i]*nums[i];
     }
     int i=0,j=nums.length-1,idx=temp.length-1;
     while(i<=j){
        if(nums[i]<nums[j]){
            temp[idx]=nums[j];
            idx--;
            j--;
        }else{
            temp[idx]=nums[i];
            idx--;
            i++;
        }
     }
     for(i=0;i<n;i++){
        nums[i]=temp[i];
     }
     return nums;
        
    }
}