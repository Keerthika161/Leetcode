class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit < 9  just add 1 and return the value

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;      // If digit == 9 make it(carry 0)to the next 
        }

        // If all digits are 9 then create a new array to resize the value
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}