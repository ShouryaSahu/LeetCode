class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Using Bit Manipulation
        // int ans = 0;
        // for(int num: nums){
        //     ans ^= num;
        // }
        // return ans;

        // Using Binary Search
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            //hamesha mid ko even index pr rakhenge kyuki jb tk single element nhi aa jata tb tk hrr duplicate element ka first element even index pr hoga aur second element odd index pr
            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid] == nums[mid+1]){ // agr yeah sahi hai mtlb mid se phle ke saare element duplicate present hai array mei toh uske baad check krenge
                low = mid + 2;
            }else{ // agr pattern tuta iska mtlb single element mid se phle hai...
                high = mid;
            }
        }

        return nums[low];



        // Not Optimised 
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for(Integer key : map.keySet()){
        //     if(map.get(key) == 1){
        //         return key;
        //     }
        // }
        // return 0;
    }
}