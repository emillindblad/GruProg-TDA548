package samples;

import static java.lang.Math.*;
import static java.lang.System.out;

/**
 * Math is a Java API for numerical calculations
 * NOTE: import Math above
 */
public class MathMethods {

    public static void main(String[] args) {
        new MathMethods().program();
    }

    void program() {
        double d = 2.1;

        out.println("Square root " + sqrt(d));
        out.println("Square " + pow(d, 2));
        out.println("Floor " + floor(d));
        out.println("Ceil " + ceil(d));
        out.println("Round " + round(d));

        // etc. many more ... type Math. (dot) and they will show up ...

        out.println(PI);  // Declared in Math library

        // Comparing doubles
        double d1 = 1.0 - 0.7 - 0.3;  // = 0
        double d2 = 1.0 - 0.6 - 0.4;  // = 0
        out.println(d1 == d2); // False!! Rounding error!

        out.println(abs(d1 - d2) < 0.000001); // Use abs function.

        // Pythagoras ... (nested calls)
        out.println(sqrt(pow(3, 2) + pow(4, 2)) == 5);

        // ... often written as (bit more efficient, no method calls, doesn't matter for now)
        out.println(sqrt(3 * 3 + 4 * 4) == 5);

    }
}
