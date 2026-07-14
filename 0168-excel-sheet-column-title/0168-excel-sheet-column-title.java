class Solution {
    public String convertToTitle(int columnNumber) {
      
        String result = "";

        while (columnNumber > 0) {
            columnNumber--; // adjust for 1-based index

            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            // prepend character
            result = ch + result;

            columnNumber /= 26;
        }

        return result;
    }
}