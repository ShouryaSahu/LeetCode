class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(nums[mid] < nums[mid + 1]){ // Iska mtlb humlog abhi upward slope pr hai peak element mid ke aage hoga
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return low; // high aur low ka index equal hoga kuch bhi return krva skte hai
    }
}