class Solution {
    public int[] constructRectangle(int area) {
        int length = area;
        int width = 1;

        for (int i = 1; i <= area; i++) {
            if (area % i == 0) {
                int l = area / i;
                int w = i;

                if (l >= w) {
                    length = l;
                    width = w;
                }
            }
        }

        return new int[]{length, width};
    }
}