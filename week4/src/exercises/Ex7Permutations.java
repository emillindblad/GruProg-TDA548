package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/*
 * Permutations of strings
 *
 * This is meant to use recursion. See
 * https://introcs.cs.princeton.edu/java/23recursion/
 * https://en.wikipedia.org/wiki/Recursion_(computer_science)
 *
 * See:
 * - UseString
 * - UseAList
 */
public class Ex7Permutations {

    public static void main(String[] args) {
        new Ex7Permutations().program();
    }

    void program() {
        List<String> ps = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        List<String> perms = null;  // Replace with perm("abc");

        // Some checks
        out.println(perms.size() == 6);
        out.println(perms.containsAll(ps));
        out.println(!perms.contains("aab"));
        out.println(!perms.contains("abb"));

    }

    // -------- Methods -----------
    // TODO

}
