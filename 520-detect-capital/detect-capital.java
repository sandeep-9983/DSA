class Solution {
    public boolean detectCapitalUse(String word) {
        int capital=0;
        int small=0;
        if(word.length()==0||word.length()==1){
            return true;
              }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>=65&&ch<=90){
                capital++;
            }
                else if(ch>=97&&ch<=122){
                    small++;
                       }       
                        }
        if(capital==word.length()) return true;
        if(small==word.length()) return true;
        if(capital==1&&word.charAt(0)>=65&&word.charAt(0)<=90){
 return true;
 }
    return false;

    }
}