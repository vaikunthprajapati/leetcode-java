/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
     int n = mountainArr.length();
     int peak = findPeak(mountainArr, n);
     int leftElement = binarySearchIncreasing(mountainArr, target, 0, peak);
     if(leftElement != -1){
        return leftElement;
     }
     return binarySearchDecreasing(mountainArr, target, peak+1, n-1);

    }

    public int findPeak(MountainArray mountainArr, int n){
        int left = 0;
        int right = n-1;
        while(left<right){
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid)<mountainArr.get(mid+1)){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }

    public int binarySearchIncreasing(MountainArray mountainArr, int target, int left, int right){
        while(left<=right){
            int mid = left + (right - left) / 2;
            int value = mountainArr.get(mid);
            if (value == target){
                return mid;
            }
            else if (value < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
        }

     public int binarySearchDecreasing(MountainArray mountainArr, int target, int left, int right){
        while (left <= right) {
        int mid = left + (right - left) / 2;
        int value = mountainArr.get(mid);
        if (value == target) {
            return mid;
        }
        else if (value > target) {
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }
    }
    return -1;
    }
}