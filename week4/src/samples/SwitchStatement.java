package samples;

import static java.lang.System.out;

/**
 * A switch statement is a selection (like if) but only use equality (== or equals)
 * to match.
 *
 * Used when we just are looking for equality (also somewhat more compact than if)
 */
public class SwitchStatement {

    public static void main(String[] args) {
        new SwitchStatement().program();
    }

    void program() {

        int i = 4;
        // Switch statement
        switch (i) {          // Switch with int (NOTE: double not allowed)
            case 0:                // If match 0 ...
                out.println("match 0"); // ... run this
                break;          // MUST use break, else will run "case 1" also (fall through)
            case 1:
                out.println("match 1");
                break;
            case 2:
                out.println("match 2");
                break;
            case 3:
                out.println("match 3");
                break;
            case 4:
                out.println("match 4");
                break;
            default:
               out.println("no match");  // If no match
        }
        // break will jump to here


        String s = "qqq";
        switch (s) {               // Switch with String
            case "aaa":
                out.println("match aaa");
                break;
            case "bbb":
                out.println("match bbb");
                break;
            default:
                out.println("no match");
        }

        Color c = Color.BLACK;
        switch (c) {               // Switch with enum (NOTE: other class objects not allowed)
            case WHITE:
                out.println("white");
                break;
            case BLACK:
                out.println("black");
                break;
            default:
                out.println("no match");
        }

        int j = 0;
        final int k = 1, l = 2;   // Variables allowed if final
        switch (j) {
            //case j: break;     // Not final
            case k:
                out.println(1);
                break;
            case l:
                out.println(2);
                break;
            default:
                out.println("no match");
        }
    }

    enum Color {
        BLACK, WHITE;
    }

}
