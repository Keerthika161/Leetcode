class Solution {
    public int[] decompressRLElist(int[] nums) {
        int total = 0;

        for (int i = 0; i < nums.length; i += 2) {
            total += nums[i];
        }

        int[] ans = new int[total];
        int k = 0;

        for (int i = 0; i < nums.length; i += 2) {

            for (int j = 0; j < nums[i]; j++) {
                ans[k++] = nums[i + 1];
            }
        }

        return ans;
    }
}