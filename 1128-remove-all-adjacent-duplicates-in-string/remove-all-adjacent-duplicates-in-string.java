class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
                if(!st.isEmpty()&&st.peek()==ch){
                    st.pop();}else{
                    st.push(ch);
                } }
            StringBuilder result = new StringBuilder();
            for(char c : st){
            result.append(c); }
        return result.toString();
        
    }
}