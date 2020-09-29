package samples.usestatic;

import static java.lang.System.out;

/*
 *   Some motivation for static
 *
 *   NOTE: Can't have standalone functions in Java, they
 *   always belong to some object.
 *
 *   ALSO: Possible for all instances to share some common object (without
 *   explicit passing of references)
 */
public class WhyStatic {

    public static void main(String[] args) throws NoSuchFieldException {
        new WhyStatic().program();
    }

    void program() throws NoSuchFieldException {

        // Need a numeric (global) constant
        // Silly to create a "dummy" object for a numeric constant
        //out.println(new Integer(0).MAX_VALUE);

        // Simpler implement as class variable, i.e. access using
        // class name and dot notation
        out.println(Integer.MAX_VALUE);  // Right click Goto Declaration

        // Need a pure function i.e. no object data involved
        // just params used. Silly to use object.
        // Simpler, create a class method and call using class name
        out.println(Math.sqrt(4));
        out.println(Character.isDigit('4'));

    }
}
