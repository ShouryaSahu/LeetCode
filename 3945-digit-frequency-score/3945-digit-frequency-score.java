class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        while(n > 0){
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
        int score = 0;
        for(int i = 0; i < 10; i++){
            if(freq[i] > 0){
                score += i * freq[i];
            }
        }

        return score;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // while(n > 0){
        //     int digit = n % 10;
        //     map.put(digit, map.getOrDefault(digit, 0) + 1);
        //     n /= 10;
        // }
        // int score = 0;
        // for(Integer key : map.keySet()){
        //     score += key * map.get(key);
        // }

        // return score;
    }
}