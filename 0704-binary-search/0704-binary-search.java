class Solution {
    public int search(int[] nums, int target) {
      int left = 0;
      int right = nums.length - 1;
      return binaryRecursive(nums, left, right, target);
    }

    public static int binaryRecursive(int [] arr, int left, int right, int target){
        if(left>right){
            return -1;
        }
        int mid = left + (right - left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid] < target){
            return binaryRecursive(arr, mid+1,right, target);
        }
        else{
            return binaryRecursive(arr,left,mid-1,target);
        }
    }
}