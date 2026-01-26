import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> frequency = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(frequency.containsKey(nums[i])){
                frequency.put(nums[i],frequency.get(nums[i])+1);
            }else{
                frequency.put(nums[i],1);
            }

        }
        for(int val: frequency.keySet()){
            if(frequency.get(val)>n/2){
                return val;
            }
        }

        return -1;

        

    }
}