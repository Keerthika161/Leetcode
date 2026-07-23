class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int end = 0;

        for (int time : timeSeries) {
            if (time >= end) {
                total += duration;
            } else {
                total += time + duration - end;
            }

            end = time + duration;
        }

        return total;
    }
}