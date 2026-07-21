class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();

         for(String str : strs){

            // Convert string to character array
            char[] ch = str.toCharArray();

            Arrays.sort(ch);

            // Create the key
            String key = new String(ch);

            // If key is not present, create a new list
            map.putIfAbsent(key, new ArrayList<>());

            // Add the original string
            map.get(key).add(str);
         }

         return new ArrayList<>(map.values());
    }
}