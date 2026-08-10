// Last updated: 10/08/2026, 23:53:08
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, -1);
        int windowsize = 2 * k + 1;
        if (windowsize > n) {
            return ans;
        }
        long sum = 0;
        for (int i = 0; i < windowsize; i++) {
            sum = sum + nums[i];
        }
        ans[k] = (int) (sum / windowsize);
        int centre = k + 1;

        for (int right = windowsize; right < n; right++) {
            sum += nums[right];
            sum = sum - nums[right - windowsize];
            ans[centre] = (int) (sum / windowsize);
            centre++;
        }
        return ans;

    }
}