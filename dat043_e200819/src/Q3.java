/*
        Solution to question 3 here.
 */

import java.util.Arrays;

import static java.lang.System.*;

public class Q3 {

    public static void main(String[] args) {
        new Q3().program();
    }

    private void program() {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {1, 2, 2, 3, 6, 6, 6};
        int[] arr5 = {7, 5, 3, 6, 2, 2, 3, 6};


        out.println(Arrays.toString(inBoth(arr1, arr2)));
        out.println(Arrays.toString(inBoth(arr1, arr3)));
        out.println(Arrays.toString(inBoth(arr2, arr4)));
        out.println(Arrays.toString(inBoth(arr4, arr5)));
    }

    /*
        int[] inBoth(int[] a1, int[] a2) {
            int[] longest;
            int[] shortest;
            if (a1.length < a2.length) {
                longest = a2;
                shortest = a1;
            } else {
                longest = a1;
                shortest = a2;
            }

            int outlength = 0;
            int latestmatch = 0;
            for (int i : shortest) {
                for (int j : longest) {
                    if (i == j && j != latestmatch) {
                        outlength++;
                        latestmatch = i;
                    }
                }

            }


            int[] output = new int[outlength];
            return output;
        }
    */
    int[] inBoth(int[] arrOne, int[] arrTwo) {
        int shortest;
        if (arrOne.length < arrTwo.length) {
            shortest = arrOne.length;
        } else {
            shortest = arrTwo.length;
        }

        int[] arr = new int[shortest];
        int count = 0;

        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {
                if (arrOne[i] == arrTwo[j] && noDuplicates(arr, arrOne[i])) {
                    //Måste kolla duppletter innan detta
                    arr[count] = arrOne[i];
                    count++;
                    out.println(Arrays.toString(arr));
                    //break;
                }
            }
        }
        int countAgain = 0;
        int[] finalarr = new int[count];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                finalarr[countAgain] = arr[i];
                countAgain++;
            }
        }
        return finalarr;
    }

    public static boolean noDuplicates(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if (i == arr[j]) {
                return false;
            }
        }
        return true;

    }
}
