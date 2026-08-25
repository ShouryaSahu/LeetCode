class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int multiple = 1;
        int temp = k;
        while(set.contains(temp)){
            temp = k * multiple;
            multiple++;
        }

        return temp;
    }
}