class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return GCD(nums[n-1], nums[0]);
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