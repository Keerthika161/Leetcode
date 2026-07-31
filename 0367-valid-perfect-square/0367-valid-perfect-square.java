class Solution {
    public boolean isPerfectSquare(int num) {
        //newtons methos (efficient to find the squar root)
        if (num < 2) {
            return true;
        }

        long x = num;

        while (x * x > num) {
            x = (x + num / x) / 2;
        }

        return x * x == num;
    }
}