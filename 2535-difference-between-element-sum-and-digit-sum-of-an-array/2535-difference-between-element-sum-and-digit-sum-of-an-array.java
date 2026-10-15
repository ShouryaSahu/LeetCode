class Solution {
    private int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int num : nums){
            elementSum += num;
            digitSum += digitSum(num);
        }

        return Math.abs(elementSum - digitSum);
    }
}