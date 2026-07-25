class Solution {
    public static int[] reverse(int[] nums, int initial, int lastPoint){
        while(initial<lastPoint){
        int temp=nums[initial];
        nums[initial]=nums[lastPoint];
        nums[lastPoint]=temp;
        initial++;
        lastPoint--;
      }
        return nums;
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}