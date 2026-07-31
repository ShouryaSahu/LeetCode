class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int[] ans = new int[nums.length];
        int smaller = 0;
        int equal = 0;
        for(int num : nums){
            if(num < pivot) smaller++;
            else if(num == pivot) equal++;
        }

        int smallerIndex = 0;
        int equalIndex = smaller;
        int largerIndex = smaller + equal;

        for(int num : nums){
            if(num < pivot) ans[smallerIndex++] = num;
            else if(num == pivot) ans[equalIndex++] = num;
            else ans[largerIndex++] = num; 
        }

        return ans;



        // NOT APPROPRIATE BUT RIGHT

        // ArrayList<Integer> smaller = new ArrayList<>();
        // ArrayList<Integer> larger = new ArrayList<>();
        // ArrayList<Integer> same = new ArrayList<>();
        // ArrayList<Integer> combined = new ArrayList<>();

        // for(int num : nums){
        //      if(num < pivot){
        //         smaller.add(num);
        //     }else if(num > pivot){
        //         larger.add(num);
        //     }else{
        //         same.add(num);
        //     }
        // }

        // combined.addAll(smaller);
        // combined.addAll(same);
        // combined.addAll(larger);

        // int[] arr = new int[combined.size()];

        // for (int i = 0; i < combined.size(); i++) {
        //        arr[i] = combined.get(i);
        // }

        // return arr;

    }
}