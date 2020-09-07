package samples;

import java.util.Arrays;

import static java.lang.System.*;

/*
 *   Some examples of methods taking array parameters and/or possibly return array types.
 */
public class ArrayMethods {


    public static void main(String[] args) {
        new ArrayMethods().program();
    }

    void program() {
        int[] arr = {1, 2, 3, 4, 5};

        out.println(sum(arr) == 15);  // Sum all elements in array

        out.println(find(arr, 4) == 3);  // Value 4 is at index 3
        out.println(find(arr, 99) == -1);  // Not found

        out.println(findMin(arr) == 1);  // Min value

        zeroIt(arr);   // Set all values to 0
        out.println(Arrays.toString(arr).equals("[0, 0, 0, 0, 0]"));

        arr = getArr(4, 9);    // Generate array with given value for all variables
        out.println(Arrays.toString(arr).equals("[9, 9, 9, 9]"));

    }

    // ---- Methods ---------------------
    int sum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s;
    }

    // Return index (an int) to possibly found. Reason:  Because if
    // not found we can return -1 as a sign that the value was not found
    // If returning the value what to return if not found?!?
    int find(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;   // Not found!
    }

    // Find min value in array
    int findMin(int[] arr) {
        int min = arr[0];     // Assume first is min ...
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {     // .. then check if any is smaller
                min = i;
            }
        }
        return min;
    }

    // Set all elements to zero
    // NOTE: Param is a reference i.e. we will change the
    // original object outside of the method! So no return required.
    void zeroIt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    // Method to create an array
    int[] getArr(int size, int value) {
        int[] arr = new int[size];   // Create new array to return
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;  // arr is a local variable, gone when method finished
                     // *BUT* array object not gone, returning reference to the object.
    }
}
