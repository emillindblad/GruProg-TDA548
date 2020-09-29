package exercises.ex4hangman;

/*
 *  The Hangman game (in a text version)
 *  This is the game logic
 *
 *  This illustrated the concept of an "OO-model" (i.e. many connected
 *  objects from different classes). Objects working together
 *
 */
public class HangMan {

    public enum Result {
        NONE, WIN, LOOSE;
    }

    private final Man man;        // Other object in model
    private final Secret secret;  // Other object in model
    private int nGuess = 0;
    private Result result = Result.NONE;

    public HangMan(Man man, Secret secret) {
        this.man = man;
        this.secret = secret;
    }

    // The game logic
    public void update(char ch) {
        // TODO
    }

    // ----- Getters used by CLI ------------------------

    public int getNGuess() {
        return nGuess;
    }

    public Result getResult() {
        return result;
    }

    // TODO More here
}
