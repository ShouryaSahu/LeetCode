class Solution {
    public void rotate(int[] nums, int k) {
               int n = nums.length;
                k = k % n; // 

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
            //Direct K shift krke temp mei store kr rhe ussi index pr aur yeah temp[(i + k) % n] use krne se hum pure circular mei store kr skte hai !!
            // temp[3] = nums[0]
            // temp[4] = nums[1]
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }


        // ANOTHER METHOD...    
        // List<Integer> list = new ArrayList<>();
        // for (int num : nums) {
        //     list.add(num);
        // }
        // int total = list.size();
        // for(int i = 0 ; i < k ; i++){
        //     int lastElement = list.get(total - 1);
        //     list.remove(total - 1);
        //     list.add(0 , lastElement);
        // }

        // for(int i = 0 ; i < total ; i++){
        //     nums[i] = list.get(i);
        // }

    }
}