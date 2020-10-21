package samples.useaclass;

import java.util.*;

import static java.lang.System.out;

/*
 *  This is for tests of the Complex class
 */
public class TestComplex {


    public static void main(String[] args) {
        new TestComplex().program();
    }

    void program() {
        // Create objects of type Complex
        Complex c1 = new Complex(1, 2);   // Instantiate, use constructor on right side
        Complex c2 = new Complex(-3, -5);
        Complex c3 = new Complex(c2);     // Use constructor to create a copy

        //c1.re = 4;      // Can't access, private instance variable!
        //c1.img = 4;     // Can't access, private!

        out.println(c1.getRe() == 1);    // Call methods to access
        out.println(c1.getImg() == 2);

        out.println(c3.equals(c2));
        out.println(c1.sub(c2).equals(new Complex(4, 7)));
        out.println(c1.add(c1).add(c1).equals(new Complex(3, 6)));  // Chained call

        Complex[] cArr = {new Complex(1, 2), new Complex(6, -1)};    // Array of own objects
        out.println(cArr[0].sub(cArr[0]).equals(new Complex(0, 0)));

        // ---- Use Complex in collections ------------
        List<Complex> cList = new ArrayList<>();
        cList.add(new Complex(5, -2));
        out.println(cList.contains(new Complex(5, -2))); // Must have equals()

        Map<Complex, String> complexMsg = new HashMap<>();
        complexMsg.put(new Complex(0,0), "zero");        // Must have hashCode()
        out.println(complexMsg.get(new Complex(0,0)).equals("zero"));

        out.println(new Complex(5, -2).toString().equals("5.0 - 2.0i"));
    }

}
