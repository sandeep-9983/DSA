class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        for(int i=0;i<jewels.length();i++){
            char  c=jewels.charAt(i);
            for(int j=0;j<stones.length();j++){
                char s=stones.charAt(j);
                if(c==s){
                    cnt++;
                }

            }
        }
        return cnt;
        
    }
}