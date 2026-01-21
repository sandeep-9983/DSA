class Solution {
    public int lengthOfLastWord(String s) {
        String a[]=s.split(" ");
        int n=a.length;
        int length=a[n-1].length();
        return length;
    
        
    }
}