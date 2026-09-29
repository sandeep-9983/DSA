class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int k=i+1;k<n-2;k++){
                if(k>i+1&&nums[k]==nums[k-1]){
                continue;
            }
            int l=k+1;
            int r=n-1;
            while(l<r){
                long sum=(long)nums[i]+nums[k]+nums[l]+nums[r];
                if(sum==target){
                    ans.add(Arrays.asList(nums[i],nums[k],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1]){
                        l++;
                    }
                   while(l<r&&nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(sum<target){
                    l++;
                }else{
                    r--;
                }
            }
            }
        }
        return ans;

        
    }
}