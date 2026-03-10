import java.util.*;

class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m * k > bloomDay.length)
            return -1;

        int low = 1;
        int high = 0;

        for(int day : bloomDay){
            high = Math.max(high, day);
        }

        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(checkBloom(bloomDay, m, k, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }


    static boolean checkBloom(int[] bloomDay, int m, int k, int days){

        int flowers = 0;
        int bouquet = 0;

        for(int i = 0; i < bloomDay.length; i++){

            if(bloomDay[i] <= days){
                flowers++;
            }
            else{
                flowers = 0;
            }

            if(flowers == k){
                bouquet++;
                flowers = 0;
            }
        }

        return bouquet >= m;
    }
}