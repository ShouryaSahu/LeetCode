class Solution {
    public long sumAndMultiply(int n) {
        long  ans = 0;
        int sum = 0;
        int x = 0;
        int place = 1;
        while(n > 0){
            int digit = n % 10;
            if( digit != 0){
                x = digit * place + x;
                place *= 10;
                sum += digit;
            }
            n /= 10;
        }
        return (long) x * sum;
        
    }
}