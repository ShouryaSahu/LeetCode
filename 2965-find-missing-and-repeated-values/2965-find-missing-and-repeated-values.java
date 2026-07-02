class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int n = grid.length;
        int[] freq = new int[n*n + 1];

        for(int[] row : grid){
            for(int num : row){
                freq[num]++;
            }
        }

        int repeat = 0;
        int missing = 0;

        for(int i = 1 ; i <= n*n ; i++){
            if(freq[i] == 2){
                repeat = i;
            }
            if(freq[i] == 0){
                missing = i;
            }
        }
        ans[0] = repeat;
        ans[1] = missing;
        return ans;
    }
}