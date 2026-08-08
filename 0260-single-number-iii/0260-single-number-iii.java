class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int num : nums){
            map.put(num , map.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for(Integer key : map.keySet()){
            if(map.get(key) < 2) ans[index++] = key;
        }

        return ans;

    }
}