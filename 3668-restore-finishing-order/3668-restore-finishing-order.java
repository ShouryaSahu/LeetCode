class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int index = 0;
        for(int num1 : order){
            for(int num2 : friends){
                if(num1 == num2){
                    ans[index++] = num1;
                }
            }
        }
        return ans;
    }
}