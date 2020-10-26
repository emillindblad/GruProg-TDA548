/*
        Solution to question 4 here.
 */

import static java.lang.System.*;

public class Q4 {

    public static void main(String[] args) {
        new Q4().program();
    }

    private void program() {
        int[][] m = {
                {0, 1, 0, 3},
                {2, 0, 2, 1},
                {1, 0, 3, 1},
                {0, 2, 0, 2}
        };

        out.println(smallestMatrixWithSum(m, 3));
        out.println(smallestMatrixWithSum(m, 6));
        out.println(smallestMatrixWithSum(m, 11));
        out.println(smallestMatrixWithSum(m, 8));

    }

    int smallestMatrixWithSum(int[][] matrix, int sum) {
        int sublength1 = matrix.length * matrix.length;
        int sublength2 = (matrix.length - 1) * (matrix.length - 1);
        int sublength3 = (matrix.length - 2) * (matrix.length - 2);
        int submatrixAmmount = sublength1 + sublength2 + sublength3;
        int sideLength = 0;

        /*
        for loop through all possible submatrixes
            check all with length 1
                getSubMatrix(matrix, 1);
                side length = 1
                if matrixsum(currentsubmatrix) == sum
                return current side length
            check all with length 2
                side length = 2
                if matrixsum(currentsubmatrix) == sum
                return current side length
            check all with length 3
                side length = 3
                if matrixsum(currentsubmatrix) == sum
                return current side length

        */
        int[][]subMatrix;
        for (int i = 0; i < submatrixAmmount ; i++) {
            if (i<sublength1) { //check with sidelength 1
                sideLength = 1;
                subMatrix = getSubMatrix(matrix,1);
                if (matrixSum(subMatrix) == sum) {
                   return sideLength;
                }

            }
        }

            return sideLength;
    }

    int[][] getSubMatrix(int[][] matrix, int sideLength) {
        int[][] submatix = new int[sideLength][sideLength];
        int subr = 0;
        int subc = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                submatix[subr][subc] = matrix[r][c];
                subc++;

            }
            subr++;
            subc = 0;
        }
        return submatix;
    }

    int matrixSum(int[][] m) {
        int sum = 0;
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                sum += m[r][c];
            }
        }
        return sum;
    }

}
