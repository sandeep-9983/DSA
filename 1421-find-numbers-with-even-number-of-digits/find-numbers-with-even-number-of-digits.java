class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count;
        int even=0;
        for(int i=0;i<n;i++){
            int curr=nums[i];
            count=0;
            while(curr>0){
               
                 curr=curr/10;
                 count++;


            }
            if(count%2==0){
                even++;

            }
            
        }
        return even;

    }
}