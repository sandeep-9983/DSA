class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n>0){
            int s=n%10;
            product*=s;
            sum+=s;
            n=n/10;
        }
        return product-sum;
        
    }
}