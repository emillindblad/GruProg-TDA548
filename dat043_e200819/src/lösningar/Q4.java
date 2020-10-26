/*
        Solution to question 4 here.

import java.util.Arrays;

import static java.lang.System.*;

public class Q4 {

    public static void main(String[] args) {
        new Q4().program();
    }

    private void program() {
        int[] a0 = {4};
        int[] a1 = {1, 4, 0, 2};
        int[] a2 = {4, 0, 2, 0};
        int[] a3 = {1, 4, 7, 2, 0, 5, 3, 3, 1};

        //        submatrix      arr
        // equal({1,4,2,0},     {1,1,1,1}) => FALSE
        // equal({1,4,2,0},     {0,2,4,1}) => TRUE

        int[][] m = {
                {1, 4, 7},
                {2, 0, 5},
                {1, 3, 3}
                };

        out.println(hasSubmatrixWith(a0, m));
        out.println(hasSubmatrixWith(a1, m));
        out.println(hasSubmatrixWith(a2, m));
        out.println(hasSubmatrixWith(a3, m));
    }

    boolean hasSubmatrixWith(int[] arr, int[][] matrix) {
        int size = (int) Math.sqrt(arr.length);

        for (int row = 0; row <= matrix.length - size; row++) {
            for (int col = 0; col <= matrix[row].length - size; col++) {

                if (matrixContainsValues(matrix, row, col, size, arr)) {
                    return true;
                }

                int[][] subMatrix = getSubMatrix(matrix, row, col, size);
                int[] subArray = subToArray(subMatrix);

                // out.println(Arrays.toString(subArray));
                boolean match = compareArrays(subArray, arr);
                if(match) {
                    return  true;
                }

            }
        }
        return false;
    }

    boolean compareArrays(int[] array, int[] values) {

        if(array.length != values.length) {
            return false;
        }

        int valuesFound = 0;
        boolean[] usedValues = new boolean[array.length];

        for (int row = 0; row < array.length; row++) {
            for (int i = 0; i < values.length; i++) {
                if (array[row] == values[i] && !usedValues[i]) {
                    valuesFound++;
                    usedValues[i] = true;
                    break;
                }
            }
        }
        return valuesFound == values.length;
    }

    int[] subToArray(int[][] matrix) {
        int[] subArray = new int[matrix.length * matrix[0].length];
        int subArrayIndex = 0;

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix.length; col++) {

                subArray[subArrayIndex] = matrix[row][col];
                //subArray[row * matrix.length + col] = matrix[row][col];
                subArrayIndex++;

            }
        }

        return subArray;
    }

    int[][] getSubMatrix(int[][] matrix, int r, int c, int size) {
        int[][] subMatrix = new int[size][size];

        for(int row = r; row < r + size; row++) {
            for (int col = c; col < c + size; col++) {
                subMatrix[row-r][col-c] = matrix[row][col];
            }
        }

        return subMatrix;
    }

}

















    int[] subMatrix(int[][] matrix, int r, int c, int size) {
        int[] arr = new int[size*size];
        int arrIndex = 0;
        for(int row = r; row < r+size; row++) {
            for(int col = c; col < c+size; col++) {
                arr[arrIndex] = matrix[row][col];
                arrIndex++;
            }
        }
        out.println(Arrays.toString(arr));
        return arr;
    }


    boolean arrEquals(int[] arr1, int[] arr2) {
        int[] tmp1 = new int[arr1.length];
        for(int i = 0; i < tmp1.length; i++) {
            tmp1[i] = arr1[i];
        }
        int[] tmp2 = new int[arr2.length];
        for(int i = 0; i < tmp2.length; i++) {
            tmp2[i] = arr2[i];
        }

        for(int i = 0; i < tmp1.length; i++) {
            for(int j = 0; j < tmp2.length; j++) {
                if( tmp1[i] == tmp2[j] && tmp1[i] > -1 && tmp2[j] > -1) {
                    tmp1[i] = -1;
                    tmp2[j] = -1;
                }
            }
        }

        boolean allMinusOne = true;
        for(int t : tmp1) {
            if(t > -1) {
                allMinusOne = false;
            }
        }

        return allMinusOne;
    }
 */
