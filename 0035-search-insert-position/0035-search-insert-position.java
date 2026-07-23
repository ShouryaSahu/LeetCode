class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == target){
                return i;
            }else if(target > nums[i]){
                continue;
            }else{
                return i;
            }
        }
        if(target > nums[n-1]){
            return nums.length;
        }
        return 0;
    }
}