class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int v=n*n;
        int mark1=0;
        int mark2=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i=1;i<=v;i++){
            if(map.containsKey(i)){
                if(map.get(i)>1){
                    mark1=i;

                }

            }else{
                mark2=i;
            }
        }
        return new int[]{mark1,mark2};
    }
}