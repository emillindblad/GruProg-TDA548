package exercises.ex4hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * File handling for Hangman
 *
 * Used to read file word.txt containing words to guess.
 *
 * This doesn't represent some concept, it's just pure functionality, like Math class
 * so use static for the methods.
 *
 *     *** Nothing to do here ***
 */
public class FileService {

    private static final Random rand = new Random();

    public static String getWordFromFile(String pathAndFile) throws IOException {
        Path path = Paths.get(pathAndFile);
        List<String> words = FileService.readFile(path);
        String theWord = words.get(rand.nextInt(words.size()));
        return theWord;
    }


     private static List<String> readFile(Path path) throws IOException {
        List<String> lines = new ArrayList<>();
        // Use try with resources to ensure stream is closed
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if( line.length() > 0) {
                    lines.add(line);
                }
            }
            reader.close();
            return lines;
        }

    }

}
