class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int size = n-1;
        int max = 0;
        while(left < right){
           max = Math.max((size * Math.min(height[left], height[right])), max);
           if(height[left] < height[right]){
            left++;
           }else{
            right--;
           }
           size--;
        }
        return max;
    }
}