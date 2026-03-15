class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(x>0){
            int s=x%10;
            x=x/10;
            rev=(rev*10)+s;
        }
        if(temp==rev){
            return true;
        }
        return false;
    }
}