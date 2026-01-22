class Solution {
    public boolean checkRecord(String s) {
       int absent=0;
        int late=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                absent++;
                late=0;
                if(absent>=2)
              return false;}
              else if(s.charAt(i)=='L'){
                late++;
                if(late>=3)
                return false;
              }else{
                late=0;
              }

                
 }         
  return true;
}
}