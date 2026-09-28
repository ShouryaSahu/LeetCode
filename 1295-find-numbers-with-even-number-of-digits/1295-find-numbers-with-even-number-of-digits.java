class Solution {
    private boolean isEven(int n){
        int digits = 0;
        while(n > 0){
            n /= 10;
            digits++;
        }
        if(digits % 2 == 0) return true;

        return false;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(isEven(num)) count++;
        }
        return count;
    }
}