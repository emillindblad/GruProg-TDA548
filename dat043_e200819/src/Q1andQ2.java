/*
        Solution to combined question 1 and 2 here.
 */

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Q1andQ2 {

    public static void main(String[] args) {
        new Q1andQ2().program();
    }

    final Scanner sc = new Scanner(in);

    private void program() {
        int[] numbers = getUserInput();
        getDiff(numbers);
    }

    int[] getUserInput() {
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            out.print("Tal "+(i+1)+"? ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    void getDiff(int[] numbers) {
        int diff = numbers[1] - numbers[0];
        int diff2 = numbers[2] - numbers[1];
        int diffchange = diff2 - diff;
        int output = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                output = numbers[0];
            } else {
                output = output + diff;
                diff += diffchange;
            }
            out.print(output + ", ");
        }
    }
}
