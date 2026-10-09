class Solution {
    private int rev(int n){
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
            set.add(rev(num));
        }
        return set.size();
    }
}