package samples;

import static java.lang.System.out;

/*
 *   Some more examples of reference variables (arrays and string for now)
 */
public class References {

    public static void main(String[] args) {
        new References().program();
    }

    void program() {
        int[] arr1 = {7, 1, 0, 4, -2};   // Declare and initialize
        int[] arr2 = {5, 4, 3, 2, 1};   // Declare and initialize
        int[] arr3;

        out.println(arr1 == arr2);  // No, different objects
        arr3 = arr1;
        out.println(arr1 == arr3);  // Yes, references same object

        out.println(arr1[0] == arr2[0]);  // No! Not same value
        out.println(arr1[0] == arr3[0]);  // Yes! Same value

        arr1[0] = 4;
        out.println(arr3[0]); // Alias problem! arr3 changed when arr1 changed!


        String s1 = "Hello ";
        String s2 = "world";
        String s3 = s1 + s2;   // New String created and char's copied to!
        s1 = "";
        s2 = "";
        out.println(s3);  // s3 not affected if changing s1 and s2;

        s1 = s3;
        out.println(s1);  // s1 references same object as s3

        out.println(s1 == s3);  // Yes, reference same object
        out.println(s1 == "Hello world");  // No, same text but not same object
        out.println(s1.equals("Hello world"));  // True, same chars (same value)

    }
}
