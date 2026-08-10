// Last updated: 10/08/2026, 23:54:32



class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] > target) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}