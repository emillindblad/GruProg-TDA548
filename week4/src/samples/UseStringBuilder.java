package samples;

import static java.lang.System.out;

/*
 * Using a StringBuilder for mutable texts (avoid copying char's)
 * A StringBuilder will not create new objects when manipulating the text
 * (contrary to String with +-operator)
 */
public class UseStringBuilder {

    public static void main(String[] args) {
        new UseStringBuilder().program();
    }

    void program() {

        // Create a StringBuilder
        StringBuilder sb = new StringBuilder();

        // Add at end of text, no new objects!
        sb.append('a').append('b').append('c');  // StringBuilder object returned, at each call

        // Convert to String
        String s = sb.toString();
        out.println(s);

        out.println(generateLongString('X', 500));
    }

    // Below we use a StringBuilder to add chars to a text.
    String generateLongString(char c, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(c);   // Much more efficient, no copying, just add last.
        }
        return sb.toString();
    }

    /*
      This would have been bad
      String s = "";
      for( .... ){
         s = s + ch;    // BAD! New string created then copy all chars in each iteration!
      }

    */

}
