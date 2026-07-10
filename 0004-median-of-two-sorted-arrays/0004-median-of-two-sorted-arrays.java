class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        for(int i = 0; i < m; i++){
            mergedArray[i] = nums1[i];
        }
        for(int i = 0; i < n; i++){
            mergedArray[m + i] = nums2[i];
        }
        Arrays.sort(mergedArray);
        int size = mergedArray.length;
        // Median

        if(size % 2 != 0){
            double median = mergedArray[size / 2];
            return median;
        }
        else{
            double median = (mergedArray[(size / 2) - 1] + mergedArray[(size / 2)]) / 2.0;
            return median;
        }
    }
}