class Solution {
    public int missingNumber(int[] nums) {
        // Not optimal solution!!
        // int n = nums.length;
        // Arrays.sort(nums);
        // int out = n;
        // for(int i = 0; i < n ; i++){
        //     if(i != nums[i]){
        //         out = i;
        //         break;
        //     }
        // }
        // return out;

        // Another method 
        // int n = nums.length;
        // int total = (n * (n + 1)) / 2;
        // int sum = 0;

        // for(int num : nums){
        //     sum += num;
        // }

        // return (total - sum);

        int total = 0;
        int arr = 0;
        for(int i = 0 ; i <= nums.length ; i++){
            total ^= i;
        }
        for(int num : nums){
            arr ^= num;
        }
        return (total ^ arr);
    }
}