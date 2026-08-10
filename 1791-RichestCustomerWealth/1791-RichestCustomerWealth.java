// Last updated: 10/08/2026, 23:53:38
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int[] row : accounts) {
            int sum = 0;

            for(int val : row) {
                sum += val;
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}