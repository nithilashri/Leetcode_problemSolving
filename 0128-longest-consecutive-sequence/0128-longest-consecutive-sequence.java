class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> num_set = new HashSet<>();
        for(int num : nums){
            num_set.add(num);
        }
        int longest = 0;
        for(int num : num_set){
            if(!num_set.contains(num-1)){
                int length = 1;
            

            while (num_set.contains(num + length)) {
                    length++;
                }

            longest = Math.max(longest, length);
        }
        }
        return longest;
        
    }
}