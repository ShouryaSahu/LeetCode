class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1 ; i <= 2*n ; i++){
            if(i % 2 == 0){
                sumEven += i;
            }else{
                sumOdd += i;
            }
        }
        return GCD(sumEven, sumOdd);
    }

    private int GCD(int a, int b){
        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}