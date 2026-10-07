class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < min) min = num;
            if(num > max) max = num;
            set.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = min; i <= max; i++){
            if(!set.contains(i)) result.add(i);
        }
        return result;

        // int min = Collections.min(set);
        // int max = Collections.max(set);

        // for(int i = min ; i <= max ; i++){
        //     if(!set.contains(i)){
        //         result.add(i);
        //     }
        // }
        // return result;

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