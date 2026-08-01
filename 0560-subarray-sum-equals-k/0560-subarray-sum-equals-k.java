class Solution {
    public int subarraySum(int[] nums, int k) {
        // if(nums.length == 1 && nums[0] == k){
        //     return 1;
        // }
        // int count = 0;
        // int sum = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //     sum += nums[i];
        //     if(sum == k) count++;
        //     for(int j = i+1 ; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum == k) count++;
        //     }
        //     sum = 0;
        // }
        // return count;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1); //Initialized starting 

        int count = 0;
        int prefixSum = 0;

        for(int num : nums){
            prefixSum += num;

            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            
        }

        return count;
    }
}