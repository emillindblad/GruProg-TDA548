package exercises;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Program to exercise arrays
 *
 * See:
 * - ArrayBasics
 */
public class Ex4Arrays {

    public static void main(String[] args) {
        new Ex4Arrays().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        out.print("Write some numbers, separated by spaces: ");
        String numbers = sc.nextLine();
        String arr[] = numbers.split(" ");
        out.println(Arrays.toString(arr));

        out.print("Input a value to find: ");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == Integer.parseInt(arr[i])) {
                out.println("Value " + num + " is at index " + i);
                found = true;
            }
        }
        if (!found) {
            out.println("Value not found!");
        }
    }
}
