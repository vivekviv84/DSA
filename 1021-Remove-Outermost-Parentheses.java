class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int cnt =0;
        StringBuilder ans = new StringBuilder();
        for(int i =0; i<n; i++){
            char c = s.charAt(i);
            if(c == ')'){
                cnt--;
            }
            if( cnt != 0){
                ans.append(c);
            }
            if(c == '('){
                cnt++;
            }

        } return ans.toString();
    }
}