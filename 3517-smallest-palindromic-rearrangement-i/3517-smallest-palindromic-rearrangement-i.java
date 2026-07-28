class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        // Case 1
        if(s.length() == 1){
            return s;
        }

        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }

        int left = 0;
        int right = s.length() - 1;
        char[] ans = new char[s.length()];
        for(int i = 0 ; i < 26 ; i++){
            char ch = (char) ('a' + i);
            while(freq[i] >= 2){
                ans[left] = ch;
                ans[right] = ch;

                left++;
                right--;
                freq[i] -= 2;
            }
        }

        for(int i = 0 ; i < 26 ; i++){
             if (freq[i] == 1) {
                ans[left] = (char) ('a' + i);
                break;
            }
        }

        String st = new String(ans);
        return st;
    }
}