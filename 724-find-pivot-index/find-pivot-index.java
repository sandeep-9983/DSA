class Solution {
    public int pivotIndex(int[] nums) {
        int left,right,current=0;
        int total=0;
        int n=nums.length;
        int prefix[]=new int[n];
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        for(int i=0;i<n;i++){
            prefix[i]=i==0?nums[i]:prefix[i-1]+nums[i];
            
        }
        for(int i=0;i<n;i++){
            left=i==0?0:prefix[i-1];
            current=nums[i];
            right=total-current-left;
            
            if(right==left){
                return i;
            }
        }
        return -1;
    }
}