class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
             int suff=0;
        int pref=0;
          for(int p=0;p<i;p++){
            pref+=nums[p];
            }
            for(int s=i+1;s<n;s++){
                suff+=nums[s];
            }
             if(pref==suff){
                return i;
             }

            }
  return -1;
            
         }
}