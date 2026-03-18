class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(num>0){
            int s=num%10;
            num=num/10;
            if(temp%s==0){
                count++;
            }
            
        }
        return count;
        
    }
}