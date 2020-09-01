package samples;


import static java.lang.System.*;

/*
 *  Types, literals and primitive variables
 *
 *  The primitive (built in) types (sets of values) in Java are
 *  - int, integers
 *  - double, real numbers.
 *  - boolean, truth values
 *  - char, a single characters
 *  - and a few more (we don't need)
 *
 *  String is *NOT* a primitive type (more in other samples)!
 *
 *  A literal is a fixed value in the code, like 6.7, 'S' or 396 (blue in IntelliJ)
 *  A literal never changes. A literal is automatically assigned at type
 *  - 45 will be an int
 *  - 3.6 will be an double. Note decimal separator is '.' (dot)
 *  - false will be a boolean
 *  - 'X' will be a char (single quotes)
 *  - "Hello" will be a String (double quotes)
 *
 *  A variable in Java is a alterable container for a specific type of value.
 *  Because a variable may only holds a specific type (the same type through the program)
 *  we have to specify what type of value the variable may hold i.e. the type
 *  of the variable.
 *
 *  A variable declarations means to specify the type and the name of a variable.
 *  - Yes, in that order
 *  - Before using a variable it *MUST* be declared.
 *  - Declaration is a statement so put ; last
 *
 *  A primitive variable is a variable declared with a primitive type.
 *
 *  Before using a variable it (normally) must be initialized (given a start value)
 *  - Initializing is done using the assignment operator '='
 *  - In this sample we declare and initialize at the same time.
 *
 * To change the value of an primitive variable we may use
 * - Assignment and increment/decrement operators (++/--) except for
 *  booleans (only assignment)
 *
 */
public class PrimitiveVariables {

    public static void main(String[] args) {
        new PrimitiveVariables().program();
    }

    void program() {
        // int a;         // Bad! Must initialize, like below
        int a = 0;        // Declare integer variable a, type and name, then initialize to 0
        int b = 5;        // 0 and 5 are integer literals (fixed values), automatically assigned type int
                          // I.e. literals and variables are compatible (types matches)
        //a = 1.56;         // Bad 1.56 is not an integer

        out.println(a);   // This will print 0 i.e. *value* in variable a on screen
        out.println(b);   // 5

        // ------ Assignment and in/decrement with int's ----------------
        a = 6;            // 0 overwritten now a contains 6
        b = a;            // 5 overwritten, replaced with a *copy* of a's value (a is still 6)
        out.println(b);   // 6

        b++;              // Increment
        out.println(b);   // 7
        b--;              // Decrement
        out.println(b);   // 6

        a = a + 1;        // + is addition. *Right side* of = evaluated first, then copied to left
        out.println(a);   // 7

        b = b + 2;        // Again
        out.println(b);   // 9

        // -- Other primitive types/variables  -----------------------------

        boolean bl = true;
        double d = 0.77;  // 0.77 is a double literal, assigned type double
        char ch1 = 'X';   // Single quote, 'X' is a character literal, assigned type char
        char ch2 = ' ';   // Space character (invisible)
        //ch2 = ''        // Bad, must be a character in between the single quotes

        // s is *NOT* a primitive variable (more to come)
        String s = "Hello world!";  // Double quote for Strings. Anything in double quotes is assign type String.
        s = "";        // The empty string, no character at all

    }
}
