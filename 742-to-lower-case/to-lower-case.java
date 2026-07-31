class Solution {
    public String toLowerCase(String s) {
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(a[i]>='A'&&a[i]<='Z'){
            char c=s.charAt(i);
            a[i]=(char)(c+32);
            }
        }
    String p=new String(a);
    return p;
    }
}