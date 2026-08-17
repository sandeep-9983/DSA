class Solution {
    public int findKthPositive(int[] arr, int k) {
        int miss=0;
        int answer=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int i=1;
        while(true){
            if(!map.containsKey(i)){
                miss++;
            if(miss==k){
               answer=i;
               break;
            }
            }
            i++;

        }
        return answer;
        

    }
}