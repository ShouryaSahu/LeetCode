class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1') count++;
        }

        if(count < k) return "";

        int[] ones = new int[count];
        int index = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                ones[index++] = i;
            }
        }

        String answer = "";
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i + k - 1 < count; i++) {
            int start = ones[i];
            int end = ones[i + k - 1];

            int length = end - start + 1;

            String candidate = s.substring(start, end + 1);

            if (length < minLength) {
                minLength = length;
                answer = candidate;
            } else if (length == minLength && candidate.compareTo(answer) < 0) {
                answer = candidate;
            }
        }

        return answer;

    }
}