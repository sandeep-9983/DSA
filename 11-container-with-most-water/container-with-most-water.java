class Solution {
    public int maxArea(int[] height) {
        
        int j=height.length-1;
        int i=0;
        int maxarea=Integer.MIN_VALUE;
        while(i<j){
            int width=j-i;
            int currmax=Math.min(height[i],height[j]);
            int area=width*currmax;
            maxarea=Math.max(maxarea,area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }

        }
        return maxarea;
    }
}