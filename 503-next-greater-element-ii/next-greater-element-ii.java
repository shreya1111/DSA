class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            int current = nums[i % n];

            // Remove all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            // Store answer only for original array
            if (i < n) {
                if (!stack.isEmpty()) {
                    ans[i] = stack.peek();
                }
            }

            // Push current element
            stack.push(current);
        }

        return ans;                        
    }
}