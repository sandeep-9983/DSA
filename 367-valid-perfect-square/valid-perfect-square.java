class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0;
        int right=num;
        while(left<=right){
            int mid=left+(right-left)/2;
          long req =(long)mid*mid;
            if(req==num){
                return true;
            }else if(req<num){
                left=mid+1;

            }else{
                 right=mid-1;
            }
        }
        return false;
    }
}