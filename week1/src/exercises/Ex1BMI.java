package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *
 * Program to calculate a persons BMI
 * See https://en.wikipedia.org/wiki/Body_mass_index
 *
 * Formula is: bmi = weight / height²     (kg/m²)
 *
 * See:
 * - F2C
 * - IO
 * - PrimitiveVariables
 * - Arithmetic
 */
public class Ex1BMI {

    // Don't care about this, must be there, start coding at program
    public static void main(String[] args) {
        new Ex1BMI().program();
    }

    // This connects our program to the keyboard
    final Scanner sc = new Scanner(in);

    void program() {
        // Write your code here

        // --- Input ---------
        out.print("Enter your weight (kg): ");
        int weight = sc.nextInt();
        out.print("Enter your height (m): ");
        double height = sc.nextDouble();

        // --- Process --------
        double bmi = (double) weight / (height * height);
        // --- Output ---------
        out.print("Your bmi is: ");
        out.print(bmi);
    }

}
