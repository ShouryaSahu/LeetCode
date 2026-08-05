class Solution {
    public int countValidPrefixes(String s) {
        int zeroCount = 0;
        int oneCount = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == '0') zeroCount++;
            if(ch == '1') oneCount++;
            if(Math.abs(zeroCount - oneCount) == 1 || Math.abs(zeroCount - oneCount) == 0) ans++;
        }

        return ans;

    }
}