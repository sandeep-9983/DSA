

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        // Process string s
        for(char c : s.toCharArray()) {
            if(c == '#') {
                if(!st1.isEmpty()) {
                    st1.pop();
                }
            } 
            else {
                st1.push(c);
            }
        }

        // Process string t
        for(char c : t.toCharArray()) {
            if(c == '#') {
                if(!st2.isEmpty()) {
                    st2.pop();
                }
            } 
            else {
                st2.push(c);
            }
        }

        return st1.equals(st2);
    }
}