// Last updated: 10/08/2026, 23:54:19
import java.util.*;

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int total = rows * cols;
        int[][] result = new int[total][2];
        
        int count = 0;
        result[count++] = new int[]{rStart, cStart};
        
        // Directions: east, south, west, north
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int steps = 1;       // initial step size
        int dirIndex = 0;    // start facing east
        
        while (count < total) {
            for (int i = 0; i < 2; i++) { // after two directions, increase step size
                int[] dir = directions[dirIndex % 4];
                for (int j = 0; j < steps; j++) {
                    rStart += dir[0];
                    cStart += dir[1];
                    
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        result[count++] = new int[]{rStart, cStart};
                        if (count == total) return result;
                    }
                }
                dirIndex++;
            }
            steps++;
        }
        
        return result;
    }
}