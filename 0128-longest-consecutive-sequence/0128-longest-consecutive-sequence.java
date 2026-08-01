class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> hashSet = new HashSet<>();
        int longest=0;
        for(int num:nums){
            hashSet.add(num);
        }
        for (int num: hashSet){
            if(!hashSet.contains(num-1)){
              int currentNum = num;
              int currentLength = 1;
              while(hashSet.contains(currentNum+1)){
                currentNum++;
                currentLength++;
              }
              longest = Math.max(longest, currentLength);
            }
        } 
        return longest;
    }
}