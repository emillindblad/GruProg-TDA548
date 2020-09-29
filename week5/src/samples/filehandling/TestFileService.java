package samples.filehandling;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/*

    Testing FileService, a class to test file IO

    Run this and inspect junk.txt and pelle.ser (.ser are binary files)

 */
public class TestFileService {

    public static void main(String[] args) {
        new TestFileService().test();
    }

    private void test() {
        List<String> data = Arrays.asList("a", "b", "c", "d", "e"); // Data to write

        // Possibly a checked exception if file or disc corrupt, must handle
        try {
            Path path = Paths.get("src/samples/filehandling/junk.txt");
            FileService.writeFile(path, data);
            List<String> copy = FileService.readFile(path);
            boolean b = true;
            // Check that what read is same as what we wrote
            for (int i = 0; i < data.size(); i++) {
                b = b && data.get(i).equals(copy.get(i));
            }
            out.println(b);
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Object to store
        MyClass o = new MyClass("pelle");
        o.setName("pelle");
        try {
            Path path = Paths.get("src/samples/filehandling/pelle.ser");
            FileService.writeObject(path, o);  // Write full object to file
            MyClass o1 = (MyClass) FileService.readObject(path);   // Read object back
            out.println(o.getName().equals(o1.getName())); // Same content ...
            out.println(o != o1);             // ...but other object!
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    // ------- Class to use for binary file handling ------------------
    // MUST Implement Serializable to be able to save the object (binary)
    // MUST be static to not have any connection to enclosing class (else
    // enclosing class also must be serializable)
    public static class MyClass implements Serializable {
        private String name;

        public MyClass(){}

        public MyClass(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
