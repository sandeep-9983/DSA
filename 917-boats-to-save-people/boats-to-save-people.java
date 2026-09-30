class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int bc=0;
        int l=0;
        int r=people.length-1;
        while(l<=r){

            int c=people[l]+people[r];
            if(c<=limit){
                bc++;
                l++;
                r--;
            }else if(c>limit){
                bc++;
                r--;
            }

        }
        return bc;
    }
}