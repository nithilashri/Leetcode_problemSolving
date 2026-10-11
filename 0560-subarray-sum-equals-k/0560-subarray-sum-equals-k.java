class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num: nums){
            prefixSum += num;
            count += map.getOrDefault(prefixSum-k, 0);
            map.merge(prefixSum, 1, Integer:: sum);
        }

        return count;
    }
}