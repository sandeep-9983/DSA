class Solution {
    public boolean isPalindrome(String s) {
       boolean ispalindrome=true;
        int l=0,r=s.length()-1;
        while(l<r){
               char left=s.charAt(l);
        char right=s.charAt(r);
            if(!Character.isLetterOrDigit(left)){
                l++;
                continue;
            }
           if(!Character.isLetterOrDigit(right)){
                r--;
                continue;
            }
           if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
            ispalindrome=false;
            break;
           }else{
            l++;
            r--;
           }




        }
        return ispalindrome;
        
    }
}