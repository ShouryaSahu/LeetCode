class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        // Find next greater element for every element in nums2
        for (int num : nums2) {

            while (!stack.isEmpty() && num > stack.peek()) {
                int smaller = stack.pop();
                map.put(smaller, num);
            }

            stack.push(num);
        }

        // Elements remaining in stack have no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}