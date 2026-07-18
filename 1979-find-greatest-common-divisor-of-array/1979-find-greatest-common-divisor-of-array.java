class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        // not useful as timecomplexity is more
        // Arrays.sort(nums); 
        // return GCD(nums[n-1], nums[0]);

        int min = nums[0];
        int max = nums[0];
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return GCD(max, min);

    }

    private int GCD(int a, int b){
       while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}