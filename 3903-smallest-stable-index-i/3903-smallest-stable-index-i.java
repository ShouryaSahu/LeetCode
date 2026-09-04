class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        // int index = 0;
        // while(index < n){
        //     int max = nums[0];
        //     int min = nums[index];
        //     for(int i = 0; i <= index; i++){
        //         max = Math.max(max,nums[i]);
        //     }
        //     for(int i = index; i < n; i++){
        //         min = Math.min(min,nums[i]);
        //     }
        //     if((max-min) <= k){ 
        //         return index;
        //     }
        //     index++;
        // }
        // return -1;


        int[] suffixMin = new int[n];
        suffixMin[n-1] = nums[n-1];
        for(int i = n - 2; i >= 0; i--){
            suffixMin[i] = Math.min(nums[i], suffixMin[i+1]);
        }

        int[] prefixMax = new int[n];
        prefixMax[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefixMax[i] = Math.max(nums[i], prefixMax[i-1]);
        }

        for(int i = 0; i < n; i++){
            if((prefixMax[i] - suffixMin[i]) <= k){
                return i;
            }
        }

        return -1;
    }
}