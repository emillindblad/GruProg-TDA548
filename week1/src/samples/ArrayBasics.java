package samples;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * To package variables of the same type we use an Array. An array is an object containing a
 * consecutive "row" of variables (elements) of the same type.
 * To access individual variables we use indices (the order number for the variable).
 * - Indexing starts at 0! So last element index is (length - 1)
 * - If using index outside, an exception will be thrown (program crash)
 *
 * Arrays types are constructed from some base type (primitive or other) by adding []
 * after the base type, some possible array types are:
 * - int[], int array
 * - double[], double array
 * - char[],
 * - etc. for all primitive type
 * - String[], array of strings
 *
 * The length of the array (the number of variables) is specified during the initialization
 * of any array variable (i.e. variable having an array type)
 * - Later we can read the length of the array object by using arr.length, see below
 *
 */
public class ArrayBasics {

    public static void main(String[] args) {
        new ArrayBasics().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // Declare array variable and initialize it
        // Will create 5 int variables (with the common name "arr") and set values at index 0 to 4.
        int[] arr = {7, 1, 0, 4, -2};

        out.println(arr);                  // Bad (strange) output ... (will print id of object in memory)
        out.println(Arrays.toString(arr)); // ... better convert to String, use built in utility (see import at top)

        out.println(arr[0]);       // Use index to read and print value of single variable
        out.println(arr[3]);

        // --- Some manipulation, using indices ------------

        arr[0] = 2;       // Assign using index
        arr[2] = arr[3];
        int n = 8;
        arr[1] = n;
        n = arr[2];
        out.println(n);
        arr[4]++;       // Increment
        out.println(Arrays.toString(arr));

        //arr[5]++;      // Exception, index outside

        int j = 2;      // Variables for indexing
        arr[j] = 99;
        arr[j + 1] = arr[j];  // Indexing may use expressions
        out.println(Arrays.toString(arr));

        // --- Create arrays in running code, i.e. NOT at declaration, MUST use "new" ------

        arr = new int[6];  // Variable arr already declared. Reuse it!
        // Create new array with 6 variables with value 0 (default initialization)

        out.println(Arrays.toString(arr));

        arr = new int[]{2, 9, 0, 1, -4};  // New array with 5 initialized variables
        out.println(Arrays.toString(arr));

        // -------------------------------------------

        int[] arr2 = {6, 7, 8};  // This is another declaration and initialization, a new variable arr2

        // ------- Traversing -----------------
        // To visit all variables in turn (left to right or the reverse) is called traversing.

        // Default way to get length of an array
        out.println("Length of array is " + arr2.length);

        // Going left to right. Use for loop + length to traverse.
        for (int i = 0; i < arr2.length; i++) {  // NOTE: Strictly less!
            out.print(2 * arr2[i] + " ");     // Just some dummy output
        }
        out.println();             // A new (empty) line, just formatting

        // Going right to left
        for (int i = arr2.length - 1; i >= 0; i--) {  // NOTE: length-1 !
            out.print(3 * arr2[i] + " ");  // Just some dummy output
        }

        // ----  Arrays and IO  --------------------------
        String[] names = new String[3];   // Declare and create String array

        out.print("Input 3 names (enter after each) > ");  // Read strings into array
        for (int i = 0; i < names.length; i++) {     // Must use loop
            names[i] = sc.nextLine();    // Read an element
        }
        out.println("Names are:");                  // Write content of array to screen
        for (int i = 0; i < names.length; i++) {
            out.println(names[i]);
        }

    }
}
