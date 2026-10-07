class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        while(!map.isEmpty()){
            int freq = 0;
            char element = 'a';
            for(char key : map.keySet()){
                if(map.get(key) > freq){
                    freq = map.get(key);
                    element = key;
                }
            }
            for(int i = 0; i < freq; i++){
                sb.append(element);
            }
            map.remove(element);
        }

        return sb.toString();
    }
}