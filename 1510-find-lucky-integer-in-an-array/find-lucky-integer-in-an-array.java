class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxlucky=-1;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue().equals(entry.getKey())){
                maxlucky = Math.max(maxlucky, entry.getKey());
            }
        }
        return maxlucky;
    }
}