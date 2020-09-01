package samples;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Logical and relational operators
 */
public class LogicAndRelationsOps {

    public static void main(String[] args) {
        new LogicAndRelationsOps().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {

        // Logical operators (don't care about warnings) ---

        out.println(!false);         // Negation
        out.println(!!true);
        out.println(true && true);   // Logical and
        out.println(true || false);  // Logical or

        // Equality and relational operators (don't care about warnings) ---

        out.println(1 == 1);  // Equal. NOTE two "=" !!!
        out.println(1 != 2);  // Not equal
        out.println(2 > 1);   // Bigger than etc.
        out.println(1 < 2);
        out.println(1 <= 1);
        out.println(1 >= 1);

        // Compound use of (don't care about warnings) ----------

        int i = 4;
        out.println( ( 1 <= i && i <= 8));  // i in closed interval [1,8]
        out.println( i < 1 || 8 < i);       // i is *not* in closed interval [1,8]

        boolean b = true;
        out.println( (i >= 4) && b);  // i greater or equal to 4 and b is true?

        // --- NOTE: For Strings == and != do normally not give the correct answer
        // Must use .equals(...)
        out.print("Input string: abc > ");
        String s = sc.nextLine();
        out.println(s == "abc");        // False, even if user typed abc
        out.println(s.equals("abc"));   // True, assume user typed abc. Use equals()!

        // This will work but it's a special case, don't use == to compare strings (more later)
        out.println("abc" == "abc");
    }
}
