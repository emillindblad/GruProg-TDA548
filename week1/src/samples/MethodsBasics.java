package samples;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  To structure the program and to help solving specific tasks we use methods.
 *  Methods, are smaller parts of a program (subprograms)
 *  - The ideal method returns a calculated value given some input values (similar to a mathematical function)
 *  - But not all are: Some methods doesn't take any input and some doesn't return any result (or both).
 *
 *  Methods here are taking or returning values of primitive types or Strings
 *
 *  Any method *MUST* be declared before use. Method declaration is like:
 *
 *  type name ( parameter list ) {        (<- method head)
 *          ...statements ...             (<- method body, a block with statements)
 *  }
 *
 *  - Type before name is type of value returned (if any), the "return type"
 *  - Name is name of method, to be used when calling the method
 *  - Parameter list is a number of variable declarations (i.e. type and name, separated with ',').
 *    The variables are used to store incoming data from the method call.
 *  - The above is collectively named the method head
 *  - Body is a block of statements that the method should execute. In particular there should
 *    be a return statement (except if method doesn't return anything).
 *
 *  To call a method (i.e. run the method):
 *  - Write method name in code, supply arguments in parenthesis.
 *  - Assign return value to some variable if value should be used later (if not value lost)
 *  - When assigning result, return type must be compatible with variable type
 *  - Declared parameter list and arguments values at call must match: number of, type of, order of
 *
 * NOTE: To inspect the execution of this try the debugger (learn how to use a debugger)
 */
public class MethodsBasics {

    public static void main(String[] args) {
        new MethodsBasics().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // Primitive parameters and return values
        // Result sent directly to out stream
        out.println(add(1, 3) == 4);    // Call to method add, arguments 1 and 3
        out.println(f2c(32) == 0);  // Call to method f2c
        out.println(abs(-12) == 12);
        out.println(pow(2, 8) == 256);
        out.println(isEven(6));  // Call method isEven(), argument 6

        // Methods with Strings
        String name = getName();
        welcome(name);

    }

    // ----- Method declarations written after (outside) program() ------------

    // Method declarations in outermost block
    // Method declaration inside other method declaration *NOT* allowed (nested not allowed)
    // Order of declarations here doesn't matter (try to change order)

    // A method declaration:
    // - Return type int, name add, two int parameters named a and b
    // - Parameter names may be chosen arbitrary, we need parameters
    // for incoming data from call (arguments (values) copied to parameters)
    int add(int a, int b) {
        return a + b;
    }

    // Fahrenheit to Celsius
    double f2c(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Sometimes must have more return statement (checked by compiler)
    int abs(int n) {
        if (n < 0) {
            return -n;
        }
        return n;
    }

    // No exp (pow) operator in Java (like ^). Write our own.
    int pow(int b, int e) {
        int p = 1;
        for (int i = 0; i < e; i++) {
            p = p * b;
        }
        return p;
    }

    // Short boolean method (usage makes code easier to read/understand)
    // Expression n % 2 == 0 evaluated, then result sent back, no need for local variables
    boolean isEven(int n) {
        return n % 2 == 0;
    }


    // String return type
    String getName() {
        out.print("Please enter your name > ");
        return sc.nextLine();   // Return input immediately
    }

    // String as parameter. void means no return value, so no return statement here.
    // This method just performs an action, no value calculated.
    void welcome(String name) {
        out.println("Welcome " + name);
    }

}
