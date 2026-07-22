class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // If length of s1 > s2 then no permutation exist in s2
        if(s1.length() > s2.length()){
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Stores Frequencies of characters of s1
        for(char ch : s1.toCharArray()){
            s1Count[ch - 'a']++;
        }

        // Sliding window concept 
        int windowSize = s1.length();

        // First starting of 2 elements
        for(int i = 0 ; i < windowSize ; i++){
            windowCount[s2.charAt(i) - 'a']++;
        }

        // If arrays are equal then true
        if(Arrays.equals(s1Count, windowCount)){
            return true;
        }

        // Moving Sliding window
        for(int i = windowSize ; i < s2.length() ; i++){

            // Add Character in sliding window
            windowCount[s2.charAt(i) - 'a']++;

            // remove starting element from window
            windowCount[s2.charAt(i - windowSize) - 'a']--;

            // Check if equals
            if(Arrays.equals(s1Count, windowCount)){
                return true;
            }
        }
        
        return false;
    }
}