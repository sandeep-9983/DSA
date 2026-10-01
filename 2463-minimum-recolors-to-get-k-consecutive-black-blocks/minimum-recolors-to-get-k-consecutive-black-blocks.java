class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        int cnt=0;
        int l=0;
        for(int r=0;r<blocks.length();r++){
            char s=blocks.charAt(r);
            if(s=='W'){
                cnt++;
            }
            if(r-l+1==k){
                min=Math.min(min,cnt);
                if(blocks.charAt(l)=='W'){
                    cnt--;
                }
                l++;
            }
        }
        return min;

        
    }
}