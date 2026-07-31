class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int left = 0;
        int right = nums.length - 1;

        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        ArrayList<Integer> same = new ArrayList<>();
        ArrayList<Integer> combined = new ArrayList<>();

        for(int num : nums){
             if(num < pivot){
                smaller.add(num);
            }else if(num > pivot){
                larger.add(num);
            }else{
                same.add(num);
            }
        }

        combined.addAll(smaller);
        combined.addAll(same);
        combined.addAll(larger);

        int[] arr = new int[combined.size()];

        for (int i = 0; i < combined.size(); i++) {
               arr[i] = combined.get(i);
        }

        return arr;

    }
}