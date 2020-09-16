package exercises;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.StrictMath.round;
import static java.lang.StrictMath.sqrt;
import static java.lang.System.out;

/*
 * Methods with array/matrix params and/or return value. Implement methods.
 *
 * See:
 * - Matrices
 */
public class Ex3MatrixMethods {

    public static void main(String[] args) {
        new Ex3MatrixMethods().program();
    }

    void program() {
        int[][] m = {           // Hard coded test data
                {-1, 0, -5, 3},
                {6, 7, -2, 0},
                {9, -2, -6, 8},
                {0, 0, 5, -6}
        };

        // Return array with all negatives in m
        //int[] negs = getNegatives(m);
        //Integer[] negs = getNegativesBetter(m); //Using arraylist for cleaner code
        //out.println(negs.length == 6);
        //out.println(Arrays.toString(negs));
        //out.println(Arrays.toString(negs).equals("[-1, -5, -2, -2, -6, -6]")); // Possibly other ordering!

        // Mark all negatives with a 1, others as 0
        // (create matrix on the fly)
        /*int[][] marked = markNegatives(new int[][]{
                {1, -2, 3,},
                {-4, 5, -6,},
                {7, -8, 9,},
        });*/
        /* marked should be (don't uncomment)
        { {0, 1, 0},
          {1, 0, 1},
          {0, 1, 0} }
        */
//        out.println(Arrays.toString(marked[0]).equals("[0, 1, 0]"));
//        out.println(Arrays.toString(marked[1]).equals("[1, 0, 1]"));
//        out.println(Arrays.toString(marked[2]).equals("[0, 1, 0]"));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Create matrix from array
        int[][] matrix = toMatrix(arr);
        /* matrix should be (don't uncomment)
        { {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9} }
        */
        plot(matrix);  // If manual inspection
        //out.println(Arrays.toString(matrix[0]).equals("[1, 2, 3]"));
        //out.println(Arrays.toString(matrix[1]).equals("[4, 5, 6]"));
        //out.println(Arrays.toString(matrix[2]).equals("[7, 8, 9]"));

        // Sum of all directly surrounding elements to some element in matrix
        // (not counting the element itself)
        // NOTE: Should be possible to expand method to include more distant neighbours
        out.println(sumNeighbours(matrix, 0, 0) == 11);
        out.println(sumNeighbours(matrix, 1, 1) == 40);
        out.println(sumNeighbours(matrix, 1, 0) == 23);
    }

    // -------- Write methods below this -----------------------


    // Use if you like (during development)
    void plot(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            out.println(Arrays.toString(matrix[row]));
        }
    }

    int[] getNegatives(int[][] matrix) {
        int negAmmount = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < 0) {
                    negAmmount++;
                }
            }
        }
        int[] arr = new int[negAmmount];
        int i = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < 0) {
                    arr[i] = matrix[row][col];
                    i++;
                }
            }
        }
        return arr;
    }

    Integer[] getNegativesBetter(int[][] matrix) { //Using ArrayList for a cleaner implementation.
        ArrayList<Integer> list = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < 0) {
                    list.add(matrix[row][col]);
                }
            }
        }
        return list.toArray(new Integer[0]);
    }

    int[][] markNegatives(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                if (m[row][col] < 0) {
                    m[row][col] = 1;
                } else {
                    m[row][col] = 0;
                }
            }
        }
        return m;
    }

    int[][] toMatrix(int[] arr) {
        int[][] m = new int[arr.length / 3][arr.length / 3];
        int i = 0;
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = arr[i];
                i++;
            }
        }
        return m;
    }
    
    int sumNeighbours(int[][] m, int a, int b) {
        int sum = 0;
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                if (m[r][c] != m[a][b] & (r != a+2 & c != b+2)) {
                    sum += m[r][c];
                }
            }
        }
        return sum;
    }
}
