class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i = 2; i < nums.length; i++){
            if(list1.get(list1.size() - 1) > list2.get(list2.size() - 1)){
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }

        List<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);

        int[] ans = new int[result.size()];

        for(int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;

    }
}