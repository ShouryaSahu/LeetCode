class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 2 ; i++){
            // skip duplicates
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int fix = i; // fixed element
            int left = i+1; //fixed ka next element
            int right = nums.length - 1; // last element

            while(left < right){
                int sum = nums[fix] + nums[left] + nums[right];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[fix], nums[left], nums[right]));

                    // skip duplicates from left and right
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{ // (sum > 0)
                    right--;
                }
            }
        }
        return ans;
    }
}