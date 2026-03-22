class Solution {
    public boolean isHappy(int n) {
        int temp = n, sum = 0;
        while(sum !=1 && sum !=4){
            sum = 0;
            while(temp > 0){
                int rem = temp % 10;
                sum+= rem * rem;
                temp/=10;
            }
        temp = sum;
        }

        return sum==1;
    }
}