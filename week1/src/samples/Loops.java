package samples;

import static java.lang.System.*;

/*
 * To repeat a number of statements we use loops i.e. the while and for
 * loops (iteration)
 *
 * NOTE: We always put the statements in a block even if there is only one statement to repeat.
 */
public class Loops {

    public static void main(String[] args) {
        new Loops().program();
    }

    void program() {

        // ----- while loop  ------------
        // Used when we don't know the number of iterations

        // Going up
        int i = 0;    // Set start value for counter
        while (i < 5) {  // Is i < 5 true? ...
            out.println("i is : " + i);  // ... yes, do the block (else continue after block)
            i++;     // Increment counter (always last)
        }            // Jump up to while and start over
        out.println("i after loop is : " + i);

        // Going down
        i = 5;
        while (i > 0) {
            out.println("i is : " + i);
            i--;   // Decrement counter
        }
        out.println("i after loop is : " + i);


        // Step
        i = 0;
        while (i < 10) {
            out.println("i is : " + i);
            i = i + 2;  // Step by 2
        }
        out.println("i after loop is : " + i);


        // Non terminating (program will hang, program running but nothing seems to happen )
        // Uncomment and run to try
        /*value = 0;
        while (value >= 0) {    // True forever
            out.println("i is : " + value);
            value++;
        }*/

        // --- for loop  -------------------
        // Used when we DO know the number of iterations

        // Going up (NOTE: int j = 0 only executed once, at loop entry)
        for( int j = 0 ; j < 5 ; j++){   // If j < 5 is true ...
           out.println("j is : " + j);    // ... execute the block (else continue after loop)
           // <------ j++ is in fact done here (lastly), but written on first line
        }  // Jump up to j < 5, and start over

        // out.println(j);     // Can't use j here, not in scope. Scope is in loop only

        // Going down
         for( int j = 10 ; j >= 0 ; j--){
           out.println("j is : " + j);
        }

        // Step by 2
         for( int j = 0 ; j < 20  ; j = j + 2){
           out.println("j is : " + j);
        }

    }
}
