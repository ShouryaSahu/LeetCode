class Solution {
    // private String reverse(String s){
    //     int left = 0;
    //     int right = s.length() - 1;
    //     char[] arr = s.toCharArray();
    //     while(left < right){
    //         char temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;

    //         left++;
    //         right--;
    //     }

    //     return new String(arr);
    // }
    public String reversePrefix(String s, int k) {
        // if(s.length() == k){
        //     return reverse(s);
        // }

        char[] arr = s.toCharArray();
        int left = 0;
        int right = k-1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
}