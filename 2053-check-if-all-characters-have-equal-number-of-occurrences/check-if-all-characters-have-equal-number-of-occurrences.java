class Solution {
    public boolean areOccurrencesEqual(String s) {
        int occur=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
  }
  for(int values:map.values()){
    if(occur==0){
        occur=values;
    }
    if(occur!=values){
        return false;
        
    }
  }

return true;
        
    }
}