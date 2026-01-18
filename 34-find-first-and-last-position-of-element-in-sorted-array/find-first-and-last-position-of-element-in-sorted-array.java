class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{ first(nums,target),last(nums,target)};
    }
        int first(int a[],int target){
            int low=0;
            int high=a.length-1;
            int ans=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(a[mid]==target){
                    ans=mid;
                    high=mid-1;
                }else if(a[mid]>target){
                   high=mid-1;
                }else{
                low=mid+1;
                    
                }
            }
            return ans;
        }
        
         int last(int a[],int target){
            int low=0;
            int high=a.length-1;
            int ans=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(a[mid]==target){
                    ans=mid;
                    low=mid+1;
                }else if(a[mid]>target){
                 high=mid-1;

                }else{
                       low=mid+1;
            
                }
            }
            return ans;
        }
        
        
    }