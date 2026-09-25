class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length];
        for(int num : nums){
            freq[num]++;
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1){
                return i;
            }
        }
        return -1;
        // int i = 0;

        // while (i < nums.length) {
        //     if (nums[i] != i + 1) {
        //         int correct = nums[i] - 1;

        //         if (nums[i] == nums[correct]) {
        //             return nums[i];
        //         }

        //         int temp = nums[i];
        //         nums[i] = nums[correct];
        //         nums[correct] = temp;
        //     } else {
        //         i++;
        //     }
        // }

        // return -1;
    }
}