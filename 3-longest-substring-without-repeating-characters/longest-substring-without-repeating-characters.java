class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int freq[]=new int[256];
        int maximum=0;
        for(int right=0;right<s.length();right++){
            int ch=s.charAt(right);
            freq[ch]++;
            while(freq[ch]>1){
                char l=s.charAt(left);
                freq[l]--;
                left++;
            }
            maximum=Math.max(maximum,right-left+1);

        }
        return maximum;
        
    }
}