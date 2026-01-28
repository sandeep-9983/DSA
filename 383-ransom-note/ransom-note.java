class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count[]=new int[26];
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            int index=ch-'a';
            count[index]++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(count[ch-'a']==0){
                return false;
            }
            count[ch-'a']--;
        }
        return true;
        
    }
}