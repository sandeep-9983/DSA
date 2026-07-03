class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
       int a[]=new int[n];
       int left=0;
       int right=n-1;
       int p=n-1;
       while(left<=right){
        int l=nums[left]*nums[left];
        int r=nums[right]*nums[right];
        if(r>l){
            a[p]=r;
            right--;
        }else{
            a[p]=l;
            left++;
        }
        p--;

       }
       return a;
    }
}