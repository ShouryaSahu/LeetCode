class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] == target){
        //         list.add(i);
        //     }
        // }
        // return list;

        int smaller = 0;
        int count = 0;
        for(int num : nums){
            if(num < target) smaller++;
            else if(num == target) count++;
        }

        for(int i = 0; i < count; i++){
            list.add(smaller + i);
        }

        return list;
    }
}