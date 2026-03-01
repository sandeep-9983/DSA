class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char c : s) {
            stack.push(c);
        }

        // Pop characters back into array
        int index = 0;
        while (!stack.isEmpty()) {
            s[index++] = stack.pop();
        }
    
        
    }
}