class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {

            int x = 0;
            int y = 0;

            if (i >= 0) x = a.charAt(i--) - '0';
            if (j >= 0) y = b.charAt(j--) - '0';

            int sum = x + y + carry;

            ans = (sum % 2) + ans;
            carry = sum / 2;
        }

        return ans;
    }
}