class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }

       for(int j=0;j<t.length();j++){
        char z=t.charAt(j);
        freq[z-'a']--;
       }
       for(int i=0;i<26;i++){
        if(freq[i]!=0){
            return false;
        }
       }
        
        return true;

    }
}