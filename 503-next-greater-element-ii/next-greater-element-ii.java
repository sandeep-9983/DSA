class Solution {
    public int[] nextGreaterElements(int[] nums) {
Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int[] finalarray = new int[n];
  for(int i = 2*n - 1; i >= 0; i--) {
  while(!s.isEmpty() && nums[s.peek()] <= nums[i % n]) {
         s.pop();
            } if(i < n) {  // only fill answer in first pass
                if(s.isEmpty()) {
                    finalarray[i] = -1;
                } else {
                    finalarray[i] = nums[s.peek()];
                }
            }
 s.push(i % n);
        }

        return finalarray;
    }
}