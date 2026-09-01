import java.util.*;

class Solution {

    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int startR = 0;
        int startC = 0;

        // Give every litter an ID
        int litterCount = 0;

        int[][] litterId = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(litterId[i], -1);

            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    startR = i;
                    startC = j;
                }

                if (ch == 'L') {
                    litterId[i][j] = litterCount++;
                }
            }
        }

        int targetMask = (1 << litterCount) - 1;

        /*
         * maxEnergy[r][c][mask]
         *
         * Maximum energy with which we have reached
         * (r, c) having collected 'mask' litter.
         */
        int[][][] maxEnergy = new int[m][n][1 << litterCount];

        for (int[][] row : maxEnergy) {
            for (int[] col : row) {
                Arrays.fill(col, -1);
            }
        }

        // State = {row, col, energy, mask}
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{
            startR,
            startC,
            energy,
            0
        });

        maxEnergy[startR][startC][0] = energy;

        int moves = 0;

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size-- > 0) {

                int[] curr = queue.poll();

                int r = curr[0];
                int c = curr[1];
                int currEnergy = curr[2];
                int mask = curr[3];

                // All litter collected
                if (mask == targetMask) {
                    return moves;
                }

                // No energy → cannot move
                if (currEnergy == 0) {
                    continue;
                }

                for (int[] dir : directions) {

                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    // Outside grid
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                        continue;
                    }

                    // Obstacle
                    if (classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }

                    int newEnergy = currEnergy - 1;

                    // Reset
                    if (classroom[nr].charAt(nc) == 'R') {
                        newEnergy = energy;
                    }

                    // Update litter mask
                    int newMask = mask;

                    if (classroom[nr].charAt(nc) == 'L') {

                        int id = litterId[nr][nc];

                        newMask = mask | (1 << id);
                    }

                    
                    if (maxEnergy[nr][nc][newMask] >= newEnergy) {
                        continue;
                    }

                    maxEnergy[nr][nc][newMask] = newEnergy;

                    queue.offer(new int[]{
                        nr,
                        nc,
                        newEnergy,
                        newMask
                    });
                }
            }

            moves++;
        }

        return -1;
    }
}