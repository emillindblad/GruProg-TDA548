package samples.filehandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/*
 *   Working with files (i.e. persistent data, data surviving the execution)
 *
 *   This also show usage of static, we don't need an object, it's
 *   pure functionality
 *
 *   *** This will NOT show up on exam (it's general knowledge) ***
 *
 */
public class FileService {

    // ---------- Text files -----------------

    public static List<String> readFile(Path path)  throws IOException {
        List<String> lines = new ArrayList<>();
         // Use try with resources to ensure stream is closed
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            // NOTE: Assignment is an expression i.e. gives a value.
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            return lines;
        }
    }

    public static void writeFile(Path path, List<String> lines) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        }
    }

    // ---------- Binary files -----------------

     public static void writeObject(Path path, Object object) throws IOException {
        // Use try with resources to ensure stream is closed
        try (ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(path))) {
            os.writeObject(object);
        }
    }

    // Return type is Objects, must cast to real type
    public static Object readObject(Path path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(Files.newInputStream(path));) {
            Object o = is.readObject();
            is.close();
            return o;
        }
    }

    // Private constructor, not possible to create objects
    private FileService(){}

}

