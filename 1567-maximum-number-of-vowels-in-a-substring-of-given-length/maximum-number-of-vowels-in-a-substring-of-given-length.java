class Solution {
    public int maxVowels(String s, int k) {
        
        int n=s.length();
        int l=0;
        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                cnt++;
            }
            if(r-l+1==k){
                max=Math.max(max,cnt);

                if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'|| s.charAt(l)=='u'){
                    cnt--;

                }
                l++;
            }
        }
        return max;
    }
}