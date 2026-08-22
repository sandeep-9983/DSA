class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int p=1;
        int s=0;
        while(n>0){
            int v=n%10;
            p*=v;
            s+=v;
            n=n/10;
        }
     int total=p+s;
     if(temp%total==0){

        return true;
     }
    return false;
    }
}