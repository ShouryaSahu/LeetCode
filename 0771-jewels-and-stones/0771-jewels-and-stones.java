class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(char ch : stones.toCharArray()){
            if(jewels.contains(String.valueOf(ch))) count++;
        }
        return count;
    }
}