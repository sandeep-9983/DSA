class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int max=Integer.MIN_VALUE;
        int j=n-1;
        while(i<j){
            int value=Math.min(height[i],height[j]);
            int width=j-i;
            int area=value*width;
            max=Math.max(area,max);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }




          
            
            

        }
        return max;
    }
}