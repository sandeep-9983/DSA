class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int req;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                req=map.get(nums[i]);
                if(Math.abs(i-req)<=k){
                    return true;
                }
            }
                map.put(nums[i],i);
            }
        return false;
    }
}