class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()){
            if(map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        
        // for(int value : map.values()){
        //     list.add(value);
        // }

        list.sort(Collections.reverseOrder());

        // First 8 letters  -> 1 push
        // Next 8 letters   -> 2 pushes
        // Next 8 letters   -> 3 pushes
        // Remaining letters -> 4 pushes
        int ans = 0;
        for(int i = 0 ; i < list.size() ; i++){
            int pushes = (i/8 + 1);
            ans += list.get(i) * pushes; 
            // i/8 + 1 for count if i < 8 = 1 and if i > 8 = 2 ; i > 16 = 3
        }

        return ans;
    }
}