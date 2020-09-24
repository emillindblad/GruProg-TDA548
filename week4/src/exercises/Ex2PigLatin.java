package exercises;

import java.util.Arrays;

import static java.lang.System.out;

/*
 *  Pig Latin, silly secret language
 *  https://en.wikipedia.org/wiki/Pig_Latin
 *
 *  See:
 *  - UseCharacter
 *  - UseStringBuilder
 *  - UseString
 *  - ShortForLoop
 *
 */
public class Ex2PigLatin {

    public static void main(String[] args) {
        new Ex2PigLatin().program();
    }

    void program() {
        out.println(toPigLatin("My name is Eric").equals("yMay amenay isway Ericway"));
    }

    // ---------- Methods --------------------

    String toPigLatin(String str) {
        String[] inputwords = str.split(" ");
        StringBuilder word = new StringBuilder();
        for (String inputword : inputwords) {
            int firstletterType = checkFirstletter(inputword);
            String encodedWord = encodeWord(inputword, firstletterType);
            word.append(encodedWord).append(" ");
        }
        return word.toString().strip();
    }

    int checkFirstletter(String inputword) {
        char firstLetter = inputword.charAt(0);
        if (Character.toString(firstLetter).matches("[aoueiyAOUEIY]")) {
            return 0; //First letter is vowel
        } else {
            return 1; //First letter is consonant
        }
    }

    String encodeWord(String inputword, int type) {
        StringBuilder encodedWord = new StringBuilder();
        String vowelSuffix = "way";
        String consonantSuffix = "ay";
        if (type == 0) {
            encodedWord.append(inputword).append(vowelSuffix);
        } else {
            encodedWord.append(inputword.substring(1)).append(inputword.charAt(0)).append(consonantSuffix);
        }
        return encodedWord.toString();
    }

}