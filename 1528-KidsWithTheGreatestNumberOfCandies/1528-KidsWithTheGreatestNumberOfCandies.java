// Last updated: 10/08/2026, 23:53:53


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int max = 0;

        // Step 1: find max
        for(int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        // Step 2: check each kid
        for(int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}