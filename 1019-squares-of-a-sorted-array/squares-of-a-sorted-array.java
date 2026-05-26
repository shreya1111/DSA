class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int index = nums.length-1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                int sq = nums[left] * nums[left];
                res[index--] = sq;
                left++;
            } else {
                int sq = nums[right] * nums[right];
                res[index--] = sq;
                right--;
            }
           
        }
        return res;
    }
}