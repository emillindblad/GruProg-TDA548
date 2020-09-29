package samples;

import java.nio.file.FileAlreadyExistsException;

import static java.lang.System.out;

/**
 * Using Exceptions
 *
 * Exceptions are used when the program is stuck and can't continue.
 * The normal flow of the program is changed. The program unwinds the call stack to look
 * for an exception handler (try..catch). If found exception handled else program aborted.
 *
 * There are two different kinds of exceptions in Java
 * - Unchecked, don't need to handle (but may as in code below)
 * - Checked, must be handled, compiler checks, compile error if not handled.
 *
 * Possibly: Run in debugger!
 */
public class Exceptions {

    public static void main(String[] args) {
        new Exceptions().program();
    }

    void program() {
        doA(3);     // No problems

        //doA(-1);     // Unhandled exception, program will halt

        try {          // Handled exception
            doA(-1);     // If exception when called, jump directly to catch
            out.println("Will this show up?"); // ... else do this, skip catch and continue
        } catch (IllegalArgumentException e) {
            out.println(e.getMessage());  // After this, exception is handled, program continues.
        }
        out.println("Program ended");
    }

    public void doA(int i) {
        doB(i);
    }

    public void doB(int i) {
        doC(i);
    }

    public void doC(int i) {
        if (i < 0) {
            // Unchecked exception (don't need too add throws to method head)
            throw new IllegalArgumentException("No negatives");
            // Checked exception (try comment above and uncomment below)
            //throw new FileAlreadyExistsException("File exists");
        }
    }

}
