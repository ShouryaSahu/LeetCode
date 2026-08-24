class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        
         Set<Integer> number = new HashSet<>();

        for (int num : nums) {
            number.add(num);
        }

        List<Integer> missingInteger = new ArrayList<>();
        for(int i = lower ; i <= upper ; i++){
            if (!number.contains(i)) {
                missingInteger.add(i);
            }
        }

        if(missingInteger.isEmpty()) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        int index = 0;

        while(index < missingInteger.size()){
            List<Integer> group = new ArrayList<>();
            group.add(missingInteger.get(index));
            while(index < missingInteger.size() - 1 && missingInteger.get(index) + 1 == missingInteger.get(index + 1)){
                index++;
            }
            group.add(missingInteger.get(index++));
            result.add(new ArrayList<>(group));
        }

        return result;

    }
}