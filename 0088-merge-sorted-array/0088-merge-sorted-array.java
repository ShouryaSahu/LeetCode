class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        for(int i = m , j = n ; i < nums1.length&&j < nums2.length; i++,j++){
            nums1[i] = 0;
            nums2[j] = 0;
        }
        for(int i = m ,j=0; i < nums1.length && j < n ; i++ , j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        
    }
}