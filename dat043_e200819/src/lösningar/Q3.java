/*
        Solution to question 3 here.

import java.util.Arrays;

import static java.lang.System.*;

public class Q3 {

    public static void main(String[] args) {
        new Q3().program();
    }

    private void program() {
        int[] arr1 = {1};
        out.println(Arrays.toString(expand(arr1)));
        int[] arr2 = {1,2,3};
        out.println(Arrays.toString(expand(arr2)));
        int[] arr3 = {5,1};
        out.println(Arrays.toString(expand(arr3)));
        int[] arr4 = {2,3,4,3};
        out.println(Arrays.toString(expand(arr4)));
    }

    int[] expand(int[] arr) {
        int[] resultat = new int[getExpandedLength(arr)];
        int resultatIndex = 0;

        resultat[0] = arr[0];
        resultatIndex++;

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr[i]; j++) {
                resultat[resultatIndex] = arr[i + 1];
                resultatIndex++;
            }
        }

        return resultat;

    }










































    int getExpandedLength(int[] arr) {
        int sum = 1;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i-1];
        }
        return sum;
    }

    /*
    int len = getExpandedLength(arr);
        int a[] = new int[len];
        a[0] = arr[0];
        int indexOrig = 0;
        int indexExpand = 1;
        for(indexOrig = 0; indexOrig < arr.length-1; indexOrig++) {
            int count = arr[indexOrig];
            while (count > 0) {
                a[indexExpand] = arr[indexOrig + 1];
                indexExpand++;
                count--;
            }
            //indexOrig++;
        }
        return a;
}
        */
