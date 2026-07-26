class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int i = 0;
        while(i < nums.length){
            if(nums[i] < min1){
                min2 = min1;
                min1 = nums[i];
            }else if(nums[i] < min2){
                min2 = nums[i];
            }

            if(nums[i] > max){
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
            }else if(nums[i] > secondMax){
                thirdMax = secondMax;
                secondMax = nums[i];
            }else if(nums[i] > thirdMax){
                thirdMax = nums[i];
            }
            i++;
        }

        return Math.max(
            (max * secondMax * thirdMax),
            (max * min1 * min2)
        );
    }
}