class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        for(int i = 0; i < s.length() ; i++){
            int index = s.charAt(i) - 'a';
            int reverseIndex = 26 - index;
            int product = (i + 1) * reverseIndex;
            degree += product;
        }

        return degree;
    }
}


    //     String alphabets = "abcdefghijklmnopqrstuvwxyz";
    //     HashMap<Character, Integer> map = new HashMap<>();
    //     int position = 26;
    //     for(char ch : alphabets.toCharArray()){
    //         map.put(ch, position--);
    //     }

    //     int index = 1;
    //     int degree = 0;
    //     for(char ch: s.toCharArray()){
    //         int product = map.get(ch) * index++;
    //         degree += product;
    //     }

    //     return degree;
    // }
// }