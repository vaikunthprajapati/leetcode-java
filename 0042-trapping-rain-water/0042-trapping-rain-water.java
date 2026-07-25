class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int result=0;
        while(left<right){
          if(height[left] <= height[right]){
            if(height[left]>=leftmax){
              leftmax=height[left];
            }
            else{
              result+=leftmax-height[left];
            }
            left++;
          }
          if(height[left] >= height[right]){
            if(height[right]>=rightmax){
              rightmax=height[right];
            }
            else{
              result+=rightmax-height[right];
            }
            right--;
          }
        }
        return result;
        }
}