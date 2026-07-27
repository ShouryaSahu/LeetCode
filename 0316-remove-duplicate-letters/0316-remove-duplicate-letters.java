class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        Stack <Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }


        stack.push(s.charAt(0));
        freq[s.charAt(0) - 'a']--;


        for(int i = 1 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']--;


            if(!stack.contains(ch)){
                if(stack.peek() < ch){
                    stack.push(ch);
                }else{
                    while(!stack.empty() && stack.peek() > ch && freq[stack.peek() - 'a'] > 0){
                       stack.pop();
                    }
                    stack.push(ch);
                }
            }
        }

        while(!stack.empty()){
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }
}