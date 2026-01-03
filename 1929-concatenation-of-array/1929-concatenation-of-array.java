class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n+n];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
            
        }
       
        return ans;

        
        
    }
}