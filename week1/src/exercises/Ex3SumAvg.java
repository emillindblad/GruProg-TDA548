package exercises;

import java.util.Scanner;

import static java.lang.System.*;;

/*
 * Program to calculate sum and average for non-negative integers
 *
 * See:
 * - Loops (while only)
 * - LoopAndAHalf
 *
 */
public class Ex3SumAvg {

    public static void main(String[] args) {
        new Ex3SumAvg().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        int sum = 0;
        int i = 0;
        while (true) {
            // -- Input (and bookkeeping)
            out.print("Enter a positive number (enter a negative number to exit): ");
            int x = sc.nextInt();
            // -- Process---
            if (x <= 0) {
                break;
            }
            sum += x;
            i += 1; // Loop iteration
            double avg = (double) sum / i;
            // -- Output ----
            out.printf("Sum: %d \n", sum);
            out.printf("Avg: %f \n", avg);
        }
    }
}
