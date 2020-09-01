package samples;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Loop and a half
 *
 * This is used when the termination of the loop depends on
 * some value (input) in the loop
 *
 */
public class LoopAndAHalf {

    public static void main(String[] args) {
        new LoopAndAHalf().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {

        // Loop termination depends on user input
        while (true) {    // Infinite loop
            out.print("Input positive int > ");    // Try negatives when running!
            int i = sc.nextInt();
            if (i > 0) {
                break;    // Break in middle (half) of loop. Jump directly out of enclosing loop
            }
        }
        out.print("Loop ended"); // <--------- break jumps to here!

    }
}
