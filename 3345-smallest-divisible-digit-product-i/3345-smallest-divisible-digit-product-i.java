class Solution {
    public int smallestNumber(int n, int t) {
        while(n >= 1 && n <= 9){
            if(n % t == 0){
                return n;
            }
            n++;
        }

        while(n >= 10 && n <= 100){
            int temp = n;
            int pro = 1;
            while(temp > 0){
                int d = temp % 10;
                pro *= d;
                temp /= 10;
            }
            if(pro % t == 0){
                return n;
            }
            n++;
        }

        return 0;
    }
}