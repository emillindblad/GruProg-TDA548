package samples;

import static java.lang.System.out;

/*
 *   Any Java program must have exactly one main method
 *   The program starts in the main method!
 */
public class TheMainMethod {

    // The main method is static because
    // this is the absolutely first code to execute
    // (so have no objects yet, must use a class method)
    // Method called when class loaded. Arguments supplied by
    // the operating system (from command line) OR
    // added in IntelliJ as stated below.
    public static void main(String[] args) {
        out.println("Arguments to program added at Edit Configurations > " +
                "TheMainMethod > Program Arguments ");
        out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            out.println(args[i]);
        }
    }


}
