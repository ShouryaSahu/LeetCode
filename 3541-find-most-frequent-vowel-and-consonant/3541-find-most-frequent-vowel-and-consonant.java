class Solution {
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxFreqSum(String s) {
        int[] vowels = new int[26];
        int[] consonants = new int[26];
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                vowels[ch - 'a']++;
            }else{
                consonants[ch - 'a']++;
            }
        }

        int maxV = 0;
        int maxC = 0;
        for(int i = 0 ; i < 26; i++){
            if(vowels[i] > maxV) maxV = vowels[i];
            if(consonants[i] > maxC) maxC = consonants[i];
        }

        return maxV + maxC;
    }
}