class Solution {
    public int findNumbers(int[] nums) {
        
        //count the digit and check weather the digit is in even or not
        //like 4-- 1 digit so odd,25-- 2 digit so even

        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}