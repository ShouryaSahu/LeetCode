class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int targetvalue = target - nums[i];

            if(map.containsKey(targetvalue)){
                return new int[] {map.get(targetvalue), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};


        


        // int[] ans = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[j] == target - nums[i]) {
        //             ans[0] = i;
        //             ans[1] = j;
        //             return ans;
        //         }
        //     }
        // }
        // If no valid pair is found, return an empty array instead of null
        // return ans;
    }
}