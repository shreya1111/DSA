import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort according to starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        // Step 2: Take the first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 3: Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            // If intervals overlap
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            }
            // No overlap
            else {
                ans.add(new int[]{start, end});

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Add the last interval
        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}