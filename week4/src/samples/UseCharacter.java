package samples;
import static java.lang.System.*;

/*
 * Useful methods in Character class
 */
public class UseCharacter {

    public static void main(String[] args) {
        new UseCharacter().program();
    }

    void program() {
        out.println(Character.isDigit('1'));
        out.println(Character.isLetter('X'));
        out.println(Character.isLetterOrDigit('2'));
        out.println(Character.isLowerCase('c'));
        out.println(Character.isUpperCase('P'));
        out.println(Character.isWhitespace(' '));
        out.println(Character.toString('Z').equals("Z"));

    }
}
