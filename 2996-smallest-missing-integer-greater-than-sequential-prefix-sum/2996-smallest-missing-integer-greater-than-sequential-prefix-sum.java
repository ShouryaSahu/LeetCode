class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            list.add(num);
        }

        int sum = nums[0];
        int j = 1;
        while(j < nums.length && nums[j-1] + 1 == nums[j]){
            sum += nums[j];
            j++;
        }

        while(list.contains(sum)){
            sum++;
        }

        return sum;
    }
}