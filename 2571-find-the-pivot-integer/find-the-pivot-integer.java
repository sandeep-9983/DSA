class Solution {
    public int pivotInteger(int n) {
int l;

int leftsum;
int rightsum;
    for(int i=1;i<=n;i++){
        l=1;
        leftsum=0;
        rightsum=0;
        while(l<=i){
            leftsum+=l;
            l++;
        }
        l--;
        while(l<=n){
            rightsum+=l;
          l++;
        }
        if(leftsum==rightsum){
            return i; 
        }
        
    
  

    }
    return -1;
        
    }
}