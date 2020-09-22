package samples;

import static java.lang.System.out;

/*
 * String is a Java standard API to work with texts. A String is an immutable
 * object so you can't change the letters in a String, have to create a new String.
 *
 * You don't need to learn all the methods by heart,
 * if allowed to use on exam you'll get a list.
 *
 * Some usable String handling below (always avoid to reinvent the wheel)
 */
public class UseString {

    public static void main(java.lang.String[] args) {
        new UseString().program();
    }

    void program() {
        String str = "abcdef";               // Will create an immutable String object
        //String str = new String("abcdef");  // This is bad will create unnecessary extra objects

        // Compare strings
        out.println(str.equals("abcdef"));   // String is a reference type
        out.println(!str.equals("qwerty"));

        // Inspecting a string
        out.println(str.isEmpty());
        out.println(str.length());
        out.println(str.charAt(3));
        out.println(str.charAt(str.length() - 1));  // Last char!

        // Search inside a string
        str = "abcdefabcdef";
        out.println(str.indexOf('a') == 0);
        out.println(str.indexOf('X') == -1);     // Not found -1
        out.println(str.indexOf("fab") == 5);    // Matches String
        out.println(str.contains("cd"));
        out.println(str.startsWith("abc"));
        out.println(str.endsWith("def"));
        out.println(str.lastIndexOf("a") == 6);

        // Manipulate Strings (will create new Strings)
        str = "Success consists of going from failure" +
                " to failure without loss of enthusiasm";

        out.println(str.toLowerCase());
        out.println(str.toUpperCase());
        out.println(str.substring(0, 4));  // New string created. NOTE: Char's 0-3
        out.println(str);                 // Original not changed

        String str1 = str.substring(0, 4);  // Keep track of the new string
        out.println(str1);
        out.println(!str1.equals(str));

        out.println("   abcde    ".trim().equals("abcde"));  // Remove leading/ending space
        out.println(str.replace("failure", "icecream"));
        out.println(str.replaceFirst("failure", "icecream"));
        out.println("abcdefaböab".replaceAll("ab", "X"));

        // Convert to array and back
        char[] arr = str.toCharArray();
        str = new String(arr);

        // Work with a single char at the time
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Do something
            }
        }

        // Split into words (Strings)
        String[] strs = str.split(" ");  // " " matches one space.
        for (String word : strs) {
            out.println(word);
        }

        // From primitive to String ...
        String s = String.valueOf(45);
        s = String.valueOf(true);
        s = String.valueOf(1.45);
        s = String.valueOf('X');

        // From String to primitive
        int i = Integer.valueOf("678");
        double d = Double.valueOf("4.57");
        boolean b = Boolean.valueOf("false");

    }


}
