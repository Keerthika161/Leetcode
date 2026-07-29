class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (i == n - 1) {
                arr[i] = -1;
                break;
            }

            int max = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            arr[i] = max;
        }

        return arr;
    }
}