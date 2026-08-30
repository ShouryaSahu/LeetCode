class Solution {
    public int findMin(int[] nums) {

        // Using Binary Search
        int low = 0; 
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return nums[low];

        // int min = Integer.MAX_VALUE;
        // for(int num : nums){
        //     if(num < min){
        //         min = num;
        //     }
        // }
        // return min;
    }
}