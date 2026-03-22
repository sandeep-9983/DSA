class Solution {
    
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (true) {
            slow = getNext(slow);             // 1 step
            fast = getNext(getNext(fast));    // 2 steps

            if (fast == 1) return true;       // early stop if happy
            if (slow == fast) break;          // cycle detected
        }

        return false;
    }

    private int getNext(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
        
   