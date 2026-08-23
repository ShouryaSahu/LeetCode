class Solution {
    public int minStartValue(int[] nums) {
        int minPrefixSum = 0;
        int sum = 0;
        
        for(int num : nums){
            sum += num;
            minPrefixSum = Math.min(minPrefixSum, sum);
        }


        int startValue = Math.abs(minPrefixSum);

          if (startValue == 0) {
            return 1;
        }

        int sum1 = startValue;

         for(int num : nums){
            sum1 += num;
            if(sum1 < 1){
                return ++startValue;
            } 
         }
        
        return startValue ;
        
        // return (1 - minPrefixSum);
    }
}