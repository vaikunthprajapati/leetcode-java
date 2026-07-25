class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positiveIndex=0;
        int negativeIndex=1;
        int[] arr= new int[nums.length];
        for(int num: nums){
            if(num>0){
                arr[positiveIndex]=num;
                positiveIndex+=2;
            }
            else{
                arr[negativeIndex]=num;
                negativeIndex+=2;
            }
        }
        return arr;
    }
}