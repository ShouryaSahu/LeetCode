class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int min = Collections.min(set);
        int max = Collections.max(set);

        List<Integer> result = new ArrayList<>();
        for(int i = min ; i <= max ; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;

        // Arrays.sort(nums);
        // int n = nums.length;
        // int start = nums[0];
        // int end = nums[n-1];
        // List<Integer> result = new ArrayList<>();
        // int i = 0;
        // while(start <= end){
        //     if(i < n && nums[i] == start){
        //         i++;
        //     }else{
        //         result.add(start);
        //     }
        //     start++;
        // }
        // return result;
    }
}