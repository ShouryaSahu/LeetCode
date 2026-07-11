class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
           return strs[0];
        }

        StringBuilder sb = new StringBuilder("");
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
             if (strs[i].length() < minLength) {
              minLength = strs[i].length();
            }
        }
        for(int i =0 ; i < minLength ; i++){
            char ch = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length; j++){
                if(strs[j].charAt(i) != ch){
                return sb.toString();
                } 
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}