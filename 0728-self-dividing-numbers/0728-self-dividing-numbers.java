class Solution {
    private boolean isSelfDividing(int n){
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            if(digit == 0) return false;
            if(n % digit != 0) return false;
            temp /= 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isSelfDividing(i)) list.add(i);
        }
        return list;
    }
}