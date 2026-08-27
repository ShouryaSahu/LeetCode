class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = 'a';
        for(char ch : letters){
            if(ch > target){
                ans = ch;
                return ans;
            }
        }
        
        return letters[0];
        
    }
}