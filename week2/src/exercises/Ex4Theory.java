package exercises;

/*
 *  For each of the section below. Uncomment and explain
 *
 */
public class Ex4Theory {

    public static void main(String[] args) {
        new Ex4Theory().program();
    }


    void program() {

        // 1. -------------------------------------------

        // Uncomment and run. Which value is correct for the volume of a sphere?
        /*
        int r = 10;
        double pi = 3.141;
        double vol1 = 4 * pi / 3 * r * r * r;
        double vol2 = pi * r * r * r * (4 / 3);
        double vol3 = 4 / 3 * pi * r * r * r;
        double vol4 = 4 / (3 * pi) * r * r * r;

        out.println(vol1);
        out.println(vol2);
        out.println(vol3);
        out.println(vol4);
        */

        // 2. ---------------------------------------------------

        // Uncomment section below and you will get compile errors. Why?
        /*
        {
            int x = 0;
            {
                int x = 0;
                int y = 0;
                out.println(x);
                out.println(y);
            }
            int x = 0;
            int y = 0;
            out.println(x);
            out.println(y);
        }
        out.println(x);
        out.println(y);
        */

        // 3. ----------------------------------------------------------

        // Uncomment and run. Explain result!
        /*
        double d1 = 1.0;
        double d2 = 1.0;
        d1 = d1 - 0.7 - 0.3;
        d2 = d2 - 0.6 - 0.4;
        out.println(d1 == 0);
        out.println(d2 == 0);
        out.println(d1 == d2);
        */

        // 4. -----------------------------------------------------

        // Uncomment and run. Explain output!
        /*
        out.println(1 + 2);
        out.println("2 + 1");
        out.println(1 + 2.0 + "a");
        out.println("a" + 1 + 2);
        out.println('a' + 1 + 2);
        out.println("a" + 'a');
        */

        // 5. ---------------------------------
        // Why is there no return type for a constructor?

        }
}
