class Solution {
    public int alternatingSum(int[] nums) {
        // int sum = 0;
        // for(int i = 0; i < nums.length ; i++){
        //     if(i % 2 == 0) sum += nums[i];
        //     else sum -= nums[i];
        // }
        // return sum;

        int sum = 0;
        boolean even = true;
        for(int num : nums){
            if(even) sum += num;
            else sum -= num;
            even = !even;
        }
        return sum;
    }
}