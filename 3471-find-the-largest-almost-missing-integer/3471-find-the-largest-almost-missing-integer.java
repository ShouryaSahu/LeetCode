class Solution {
    public int largestInteger(int[] nums, int k) {
        // int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i <= n - k; i++){
        // HashSet<Integer> set = new HashSet<>();
        //     for(int j = i; j < i+k ; j++){
        //         set.add(nums[j]);
        //     } 
        // }

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int max = 0;
        int maxOccursOnce = 0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // For k = 1
        if(k == 1){
            int ans = -1;
            for(int key : map.keySet()){
                if(map.get(key) == 1){
                    ans = Math.max(ans, key);
                }
            }
            return ans;
        }

        // For k = n
        else if(k == n){
            int ans = -1;
            for(int num: nums){
                ans = Math.max(ans, num);
            }
            return ans;
        }

        //for general case
        else{
            int firstCount = map.get(nums[0]);
            int lastCount = map.get(nums[n - 1]);
            if(firstCount == 1 && lastCount == 1){
                return Math.max(nums[0], nums[n - 1]);
            }
            else if(firstCount == 1) return nums[0];
            else if(lastCount == 1) return nums[n - 1];
            else return -1;
        }
    }
}