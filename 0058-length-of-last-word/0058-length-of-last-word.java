class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] arr = s.split(" ");
        String ans = arr[arr.length - 1];
        return ans.length();
    }
}