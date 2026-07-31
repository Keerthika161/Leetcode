class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        // count the empty space method 

        int count = 0;
        int zeros = 1;

        for (int flower : flowerbed) {
            if (flower == 0) {
                zeros++;
            } else {
                count += (zeros - 1) / 2;
                zeros = 0;
            }
        }

        zeros++;
        count += (zeros - 1) / 2;

        return count >= n;
    }
}