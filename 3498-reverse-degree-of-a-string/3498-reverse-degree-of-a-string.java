class Solution {
    public int reverseDegree(String s) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> map = new HashMap<>();
        int position = 26;
        for(char ch : alphabets.toCharArray()){
            map.put(ch, position--);
        }

        int index = 1;
        int degree = 0;
        for(char ch: s.toCharArray()){
            int product = map.get(ch) * index++;
            degree += product;
        }

        return degree;
    }
}