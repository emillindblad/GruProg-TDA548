package samples;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * (this is a file header comment (a multiline comment, no impact on program))
 *
 * Program to convert Fahrenheit to Celsius
 *
 * This also shows the program structure we should try to adhere to
 *
 *         Input --> Process --> Output
 *
 *  To run: Right click in code > Run
 */
public class F2C {

    // Don't care about this, must be there, program starts at program() // this is a single line comment
    public static void main(String[] args) {
        new F2C().program();
    }

    // This connects our program to the keyboard using a stream named 'in'.
    // sc is the name of a scanner, able to convert key presses to values
    final Scanner sc = new Scanner(in);

    void program() {        // Program starts
        double fahrenheit;  // Variable declarations (storage locations)
        double celsius;

        // ---- Input ----
        out.print("Enter Fahrenheit > "); // Print to screen to notify user
        fahrenheit = sc.nextDouble();     // When running, write input in window below + Enter

        // ---- Process ----
        celsius = (fahrenheit - 32) * 5 / 9;    // Some calculations (NO output here!)

        // --- Output ----
        out.println(fahrenheit + " F = " + celsius + " C");  // Output result to screen

    } // Program ends
}
