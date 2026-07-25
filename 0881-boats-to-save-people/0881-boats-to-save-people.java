class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int first=0;
        int second= people.length-1;
        int boats=0;
        Arrays.sort(people);
        while(first<=second){
            int sum=people[first]+people[second];
            if(sum<=limit){
                first++;
                second--;
            }
            else if(sum>limit){
                second--;
            }
            boats++;
        }
        return boats;
        
    }
}