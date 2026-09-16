import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length;

        // Store number of soldiers in every row
        int[] soldiers = new int[m];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                soldiers[i] += mat[i][j];
            }
        }

        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {

                // More soldiers = stronger = worse for us
                if (soldiers[a] != soldiers[b]) {
                    return Integer.compare(soldiers[b], soldiers[a]);
                }

                // Same soldiers:
                // Larger index = stronger/worse
                return Integer.compare(b, a);
            }
        );

        // Put row indices into heap
        for (int i = 0; i < m; i++) {

            pq.add(i);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Get answer
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        // Heap gives strongest among selected first,
        // so reverse the result
        for (int i = 0; i < k / 2; i++) {
            int temp = result[i];
            result[i] = result[k - 1 - i];
            result[k - 1 - i] = temp;
        }

        return result;
    }
}