class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String s : words){
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                sum += weights[ch - 'a'];
            }
            int index = sum % 26;
            char ch = (char) ('z' - index);
            sb.append(ch); 
        }

        return sb.toString();
    }
}