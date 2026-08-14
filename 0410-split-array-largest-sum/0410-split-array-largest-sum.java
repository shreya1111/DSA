class Solution {
    public int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        // Find the minimum possible answer and maximum possible answer
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        // Binary Search on the answer
        while (start < end) {

            int mid = start + (end - start) / 2;

            if (canSplit(nums, k, mid)) {
                // mid is possible
                // Try to find an even smaller answer
                end = mid;
            } else {
                // mid is not possible
                // Need a larger maximum sum
                start = mid + 1;
            }
        }

        return start;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {

        int parts = 1;
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num > maxSum) {
                // Start a new subarray
                parts++;
                currentSum = num;

                // We need more than k subarrays
                if (parts > k) {
                    return false;
                }

            } else {
                currentSum += num;
            }
        }

        return true;
    }
}