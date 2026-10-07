class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for(char chS : s.toCharArray()){
            mapS.put(chS, mapS.getOrDefault(chS, 0)+1);
        }
        for(char chT : t.toCharArray()){
            mapT.put(chT, mapT.getOrDefault(chT, 0)+1);
        }
        for(char key : mapS.keySet()){
            if(!mapT.containsKey(key) || !mapT.get(key).equals(mapS.get(key))) return false;
        }
        return true;
    }
}