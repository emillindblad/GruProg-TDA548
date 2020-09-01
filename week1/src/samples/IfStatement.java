package samples;

import java.util.Random;

import static java.lang.System.*;

/**
 * To select between different statements we use the if statement (selection)
 *
 * NOTE: We always put the statements in a block even if there is only one statement.
 */
public class IfStatement {

    public static void main(String[] args) {
        new IfStatement().program();
    }

    final Random rand = new Random();

    void program() {
        int i = rand.nextInt(10);  // Random int numbers
        int j = rand.nextInt(10);
        int k = rand.nextInt(10);

        // If statement (NOTE: "{" on same line!)
        if (i == 2) {                       // if i equals 2 true ...
            out.println("i is 2");          // .. do this. Continue after '}'
        }                                   // <--- NO ';' after closing '}'

        // If-else statement
        if (j > 3) {                 // if j > 3 true ...
            out.println("j > 3");    //... do this...
        } else {                     // ... else ...
            out.println("j <= 3");   // ... do this. Continue after }
        }

        // If-else if-statement (else if-ladder).
        // NOTE: Only one of alternatives is executed! If one true found
        // no other tested. If none found else branch is executed.
        if (j == 3) {
            out.println("j is 3");
        } else if (k <= 20) {
            out.println("k <= 20");
        } else {
            out.println("j != 3 and k > 20");
        }

    }
}
