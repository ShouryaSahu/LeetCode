class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()){
            if(map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        List<Integer> list = new ArrayList<>();
        
        for(int value : map.values()){
            list.add(value);
        }
        list.sort(Collections.reverseOrder());

        int ans = 0;
        for(int i = 0 ; i < list.size() ; i++){
            ans += list.get(i) * (i/8 + 1); 
            // i/8 + 1 for count if i < 8 = 1 and if i > 8 = 2 ; i > 16 = 3
        }

        return ans;
    }
}