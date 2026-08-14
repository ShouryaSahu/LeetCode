class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int left = 0;
        int maxLength = 0;
        int currentWindow = 0;

        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            while(freq[ch - 'a'] > 2){
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            currentWindow = i - left + 1;
            maxLength = Math.max(maxLength, currentWindow);

        }
        return maxLength;
    }
}