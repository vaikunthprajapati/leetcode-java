class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums,target,true);
        int right = binarySearch(nums,target,false);
        return new int[] {left,right};
    }
    public static int binarySearch(int [] arr, int target, boolean leftBias){
        int left = 0;
        int right = arr.length-1;
        int i = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target < arr[mid]){
                right = mid - 1;
            }
            else if(target > arr[mid]){
                left = mid + 1;
            }
            else{
                i = mid;
                if(leftBias){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return i;
    }
}