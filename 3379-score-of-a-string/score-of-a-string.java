class Solution {
    public int scoreOfString(String s) {
        int totalcount=0;
        for(int i=0;i<s.length()-1;i++){
            char fc=s.charAt(i);
            char sc=s.charAt(i+1);
          int   value=Math.abs(fc-sc);
            totalcount+=value;
        }
        return totalcount;
    }
}