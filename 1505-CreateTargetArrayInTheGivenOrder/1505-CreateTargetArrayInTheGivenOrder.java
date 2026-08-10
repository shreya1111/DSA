// Last updated: 10/08/2026, 23:53:57
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int size = 0;

        for (int i = 0; i < nums.length; i++) {
            // shift elements right
            for (int j = size; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            target[index[i]] = nums[i];
            size++;
        }

        return target;
    }
}