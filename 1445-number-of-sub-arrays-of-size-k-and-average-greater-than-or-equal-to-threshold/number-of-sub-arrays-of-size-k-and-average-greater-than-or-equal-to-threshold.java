class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start=0;
        int count=0;
        double sum=0;
        double average=0;
        for(int end=0;end<arr.length;end++){
            sum+=arr[end];
            if(end-start+1==k){
                average=sum/k;
                if(average>=threshold){
                    count++;
                }
               sum-=arr[start];
                start++;
            }
        }
        return count;
        
    }
}