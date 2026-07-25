class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        int max = 0;
        while(n > 0){
            int digit = n % 10;
            list.add(0, digit);
            n /= 10;
        }
        for(int i=0; i < list.size() ; i++){
            for(int j = i+1 ; j < list.size() ; j++){
                max = Math.max(max, (list.get(i) * list.get(j)));
            }
        }
        return max;
    }
}