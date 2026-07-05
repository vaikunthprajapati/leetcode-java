class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int windowSum=0;
        int minLength=Integer.MAX_VALUE;
        int left=0;
        for(int right=0; right < n ; right++){
            windowSum+=nums[right];
            while(windowSum>=target){
                windowSum-=nums[left];
                minLength=Math.min(minLength,right-left+1);
                left++;
            }
        }
    return minLength==Integer.MAX_VALUE ? 0: minLength;
    }
}