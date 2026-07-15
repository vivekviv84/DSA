class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        if (s.length() == 0)
            return 0;

        int sign = 1;
        int i = 0;
        long ans = 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            if (ans > Integer.MAX_VALUE / 10 ||
               (ans == Integer.MAX_VALUE / 10 && digit > (sign == 1 ?7:8))) {

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return (int)(sign * ans);
    }
}