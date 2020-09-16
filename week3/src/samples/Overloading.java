package samples;

import static java.lang.System.out;

/*
 * Overloading = Different method may have same name
 * Allowed only if the parameter list is different (types and/or number of args).
 *
 * Typical usage: Need to do same operation on arguments with different types
 */
public class Overloading {

    public static void main(String[] args) {
        new Overloading().program();
    }

    void program() {
        out.println(max(2, 3));        // Call ..
        out.println(max(-5.3, 4.06));  // ... call overloaded

        out.println(max(3, 4.0));  // Hmm, which one called?

        int[] i = {1, 2, 3};
        double[] j = {4, 5, 6};
        out.println(sum(i));
        out.println(sum(j));  // Must uncomment sum(double[]) below
    }

    // -------- Methods ----------------------

    // Find max of two int's
    int max(int i, int j) {
        return i > j ? i : j;   // An if *expression* i.e. a result is created
                                // If true return i else j
                                // The (normal) if-statement doesn't return anything!
    }

    // Alt. for the above using if-statement
    /*int max(int i, int j) {
        if (i > j) {
            return i;
        }
        return j;
    }*/

    // Find max of two doubles's (overloaded)
    double max(double i, double j) {  // Overloaded! Same name different arg types
        return i > j ? i : j;
    }

    // Sum int's
    int sum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s;
    }

    // Sum double's (overloaded)
    double sum(double[] arr) {
        double s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s;
    }

}

