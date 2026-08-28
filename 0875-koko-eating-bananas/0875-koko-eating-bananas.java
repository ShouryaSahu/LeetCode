class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1;
        for(int max : piles){
            if(high < max){
                high = max;
            }
        }

        
        while(low <= high){
            int k = low + (high - low) / 2; // act as mid in binary search
            long totalHour = 0; // time to eat total piles of banana
            for(int pile: piles){
                totalHour += (pile + k - 1) / k;
            }

            if(totalHour <= h){
                high = k - 1;
            }else{
                low = k + 1;
            }

        }

        return low;
    }
}