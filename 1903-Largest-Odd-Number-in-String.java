class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1; i >= 0; i--){
            char c = num.charAt(i);
            if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9'){
                return num.substring(0,i+1);
            }
        }
        return "";  
    }
}