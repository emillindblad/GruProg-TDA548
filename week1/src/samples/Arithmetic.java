package samples;

import java.util.Scanner;

import static java.lang.System.*;

/*
 *  Arithmetic with Java, mostly as you are used to in math.
 *
 */
public class Arithmetic {

    public static void main(String[] args) {
        new Arithmetic().program();
    }

    final Scanner scan = new Scanner(in);

    void program() {
        int op1;    // Variable declarations
        int op2;

        out.print("Input 2 integers (enter after each) > ");  // Prompt user
        op1 = scan.nextInt();   // Some IO
        op2 = scan.nextInt();

        // All below are statements so put ";" last
        // The right side is an expression, i.e a value. Right side calculated first!
        // Always a variable to the left.
        int result = op1 + op2;                // Addition.

        out.println("Result + " + result);     // NOTE: '+' used with at least one String-operand
                                               // is concatenation (merging strings)
                                               // I.e. + has different meaning depending on
                                               // operands (overloaded operator). '+' is addition or concatenation!

        result = op1 - op2;                    // Subtraction
        out.println("Result - " + result);

        result = op1 * op2;                    // Multiplication
        out.println("Result * " + result);

        result = op1 / op2;                    // Division. Oh, oh, ..
        out.println("Result / " + result);     // ... this is integer division! (Because both operands integer)

        double dResult = (double) op1 / op2;      // (double) will cast (change type of) value in op1
        out.println("Result real / " + dResult);  // Now we get real division

        result = op1 % op2;                       // Remainder operator (modulo)
        out.println("Result % (modulo) " + result);

        out.println("Left to right " + 4/2/2);    // Associativity (Left to right normally)
        out.println("Using parentheses " + 4/(2/2));

        result = 4 + 6 / 3 * 2;                   // Whats is above/below the division sign?
        out.println("Result prio 1" + result);

        result = 4 + 6 / (3 * 2);                   // Use parentheses to get correct result!
        out.println("Result prio 2 " + result);

        result = -op1;                             // Negation
        out.println("Result unary - " + result);
        result = +result;                         // Seldom (never) used
        out.println("Result unary + " + result);

        // NO exp/power operator like ^

        // out.println("Int div with zero " + 1/0);   // Arithmetic Exception
        out.println("Double div with zero " + 1.0/0);    // Infinity
    }
}
