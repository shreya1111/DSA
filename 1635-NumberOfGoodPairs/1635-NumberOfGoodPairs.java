// Last updated: 10/08/2026, 23:53:59
class Solution {
   public int numIdenticalPairs(int[] nums) {
    int[] freq = new int[101];  // assuming values 0–100

    int count = 0;

    for(int num : nums) {
        count += freq[num];  // how many same numbers seen before
        freq[num]++;         // update frequency
    }

    return count;
}
}