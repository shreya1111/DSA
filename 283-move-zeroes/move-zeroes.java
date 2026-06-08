class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        int n = nums.length;

        int temp[] = new int[n];

        
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[k++] = nums[i];
            }
        }

        
        while (k < n) {
            temp[k++] = 0;
        }

       
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}