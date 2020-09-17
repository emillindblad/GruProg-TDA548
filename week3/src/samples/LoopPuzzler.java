package samples;

import static java.lang.System.out;

/*
 *    A Puzzler, plotting a pattern
 */
public class LoopPuzzler {

    public static void main(String[] args) {
        new LoopPuzzler().program();
    }

    void program() {

        // Plot a half square.
        for (int i = 10; i >= 1; i--) {
            for (int j = 0; j < i; j++) {   // j depends on i !!!
                out.print("X");
            }
            out.println();
        }
    }
}
