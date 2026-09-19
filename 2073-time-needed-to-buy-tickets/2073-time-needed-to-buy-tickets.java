class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0;
        for(int i = 0; i<tickets.length; i++){
            if(i<=k){
                if(tickets[i]<tickets[k]){
                    result += tickets[i];
                }
                else{
                    result += tickets[k];
                }
            }
            else{
                if(tickets[i]>=tickets[k]){
                    result += tickets[k]-1;
                }
                else{
                    result += tickets[i];
                }
            }
        }
        return result;
    }
}