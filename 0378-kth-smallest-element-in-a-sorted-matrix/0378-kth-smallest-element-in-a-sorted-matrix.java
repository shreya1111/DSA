import java.util.*;

class Solution {

    // Node class
    class Node {
        int value;
        int row;
        int col;

        Node(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.value, b.value)
        );

        // First element of every row
        for (int i = 0; i < n; i++) {
            pq.add(new Node(matrix[i][0], i, 0));
        }

        // Remove smallest k times
        for (int i = 0; i < k; i++) {

            Node current = pq.poll();

            // kth smallest
            if (i == k - 1) {
                return current.value;
            }

            // Next element from same row
            int nextCol = current.col + 1;

            if (nextCol < n) {
                pq.add(
                    new Node(
                        matrix[current.row][nextCol],
                        current.row,
                        nextCol
                    )
                );
            }
        }

        return -1;
    }
}