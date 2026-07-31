class Solution {
    public int lengthOfLastWord(String s) {
        String a=s.trim();
        int n=a.length()-1;
        int cnt=0;
        for(int i=n;i>=0;i--){
            char c=a.charAt(i);
            if(c !=' '){
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
        
    }
}