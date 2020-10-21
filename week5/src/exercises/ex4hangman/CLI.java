package exercises.ex4hangman;


import java.io.IOException;
import java.util.Scanner;

import static exercises.ex4hangman.HangMan.Result.WIN;
import static java.lang.System.*;

/*
 *    Command Line Interface for Hangman OO model
 *    No game logic here
 *
 *    Run this to run the game
 */
public class CLI {

    public static void main(String[] args) {
        new CLI().program();
    }

    public static final String DEFAULT_PATH = "src/exercises/ex4hangman/words.txt";
    private final String NL = System.lineSeparator();  // System independent new Line
    private final Scanner sc = new Scanner(in);

    private HangMan hangMan;  // Global reference to OO - model

    private void program() {
        String theWord = null;
        try {
            theWord  = FileService.getWordFromFile(DEFAULT_PATH);
        } catch (IOException ex) {
            plotException(ex);
            exit(0);
        }

        // Build OO model
        // TODO

        welcomeMsg(0);   // TODO

        // TODO The game loop

        // Game ended
        winMsg(hangMan.getResult(), hangMan.getNGuess(), "xxxx");  // TODO
    }

    // ------------- Helpers and graphics --------------------------

    // Parts of the hanging man (NL is the new line character, don't need to understand)
    private final String[] parts = {
            "---|" + NL,
            "   |" + NL,
            "   O" + NL,
            "  /",
            "|",
            "\\" + NL,
            "  /",
            " \\" + NL,
    };

    public char guessCharacter() {
        String input;
        while (true) {
            out.print("Enter a char > ");
            input = sc.nextLine();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                break;
            }
        }
        return input.charAt(0);
    }

    public void plotMask(String mask) {
        for (char ch : mask.toCharArray()) {
            out.print(ch + " ");
        }
        out.println();
    }

    public void plotMan(int health) {
        for (int i = 0; i < parts.length - health; i++) {
            out.print(parts[i]);
        }
        if( health == 1 || health == 3 || health == 4){   // Layout
            out.println();
        }

    }

    public void welcomeMsg(int wordLength) {
        out.println("Welcome to HangMan, try to guess the word! It's "
                + wordLength + " char long");
    }

    public void winMsg(HangMan.Result result, int nGuesses, String answer) {
        if ( result == WIN) {
            out.println("You made it. You needed " + nGuesses + " tries");
        } else {
            out.println("Sorry you lost. Word(s) was: " + answer);
        }
    }

    public void plotException(Exception e) {
        out.println("Exception: " + e.getMessage());
    }
}