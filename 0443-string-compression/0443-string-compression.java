class Solution {
    public int compress(char[] chars) {
        int i = 0;      // start of a group
        int index = 0;  // position to write compressed characters

while (i < chars.length) {
    char current = chars[i];
    int count = 0;

    while (i < chars.length && chars[i] == current) {
        i++;
        count++;
    }

    chars[index++] = current;

    if (count > 1) {
        for (char c : String.valueOf(count).toCharArray()) {
            chars[index++] = c;
        }
    }
    }
    return index;        
    }
}