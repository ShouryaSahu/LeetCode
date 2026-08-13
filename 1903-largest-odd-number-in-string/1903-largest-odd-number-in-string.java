class Solution {
    public String largestOddNumber(String num) {
       StringBuilder sb = new StringBuilder(num);

       while(!sb.isEmpty()){
            int lastDigit = sb.charAt(sb.length() - 1) - '0';
            if(lastDigit % 2 != 0){
                return sb.toString();
            }else{
                sb.deleteCharAt(sb.length() - 1);
            }
       }

       return sb.toString();
    }
}