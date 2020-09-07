package samples;

import java.util.Arrays;

import static java.lang.System.*;

/*
 *  A matrix is 2 dimensional array, an array of arrays
 *
 *  Must use 2 index: First is row and second is col
 *  As usual index starts on 0.
 *
 *  NOTE: We normally use square matrices!
 */
public class Matrices {

    public static void main(String[] args) {
        new Matrices().program();
    }

    void program() {
        // Declare and initialize matrix
        int[][] m = {               // An array of arrays
                {1, 2, 3,},          // m[0] = first row (first sub array)
                {4, 5, 6,},          // m[1]
                {7, 8, 9,},          // m[2]
        };

        out.println(m[0][2] == 3);   // Row 0, col 2
        //out.println(m[1][3] == 6);   // Exception, index out of bounds

        m[1][2] = 99;    // Assign

        int r = 2;
        int c = 2;
        m[r][c - 1] = -1;    // Assign using variables

        // Traversing. Must use nested loops
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col]++;   // Increment each element
            }
        }
        plotMatrix(m);

        //  Create new matrices in program
        m = new int[2][2];      // New 4x4 matrix with 0's
        plotMatrix(m);

        m = new int[][]{    // New 4x4 initialized with values
                {11, 12},
                {21, 22}
        };
        plotMatrix(m);

        int s = sum(m);
        out.println(s);

        int[][] theCopy = copy(m);  // Make a copy
        plotMatrix(theCopy);

    }

    // --------- Methods ----------------------

    int sum(int[][] m) {
        int sum = 0;
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m.length; c++) {
                sum = sum + m[r][c];
            }
        }
        return sum;
    }


    int[][] copy(int[][] m) {
        // Create the copy matrix
        int[][] cpy = new int[m.length][m.length];
        for (int r = 0; r < m.length; r++) {      // Copy values from m to cpy
            for (int c = 0; c < m.length; c++) {
                cpy[r][c] = m[r][c];
            }
        }
        return cpy;
    }

    void plotMatrix(int[][] m) {
        // Traversing
        for (int row = 0; row < m.length; row++) {
            // Row is an array!
            out.println(Arrays.toString(m[row]));
        }
    }

}

