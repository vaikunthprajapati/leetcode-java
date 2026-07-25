class Solution {
    public int findNonMinOrMax(int[] nums) {

        int greatest=Integer.MIN_VALUE;
      int smallest=Integer.MAX_VALUE;
        if(nums.length<3){
        return -1;
        }
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if((a > b && a < c) || (a<b && a>c)){
          return a;
        }
        else if((b > a && b < c) || (b<a && b>c)){
          return b;
        }
        return c;
    }
}