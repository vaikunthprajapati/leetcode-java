class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            sum += num;
            int rem = ((sum%k)+k)%k;
            count += map.getOrDefault(rem,0);
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return count;
    }
}