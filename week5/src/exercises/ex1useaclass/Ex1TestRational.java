package exercises.ex1useaclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.abs;
import static java.lang.System.out;

/*
 * Test for Rational class (objects of type Rational)
 * Make test print true for all out.println()
 */
public class Ex1TestRational {

    public static void main(String[] args) {
        new Ex1TestRational().test();
    }

    // No program just testing
    private void test() {
        // As usual, all output should print true
        Rational r = new Rational(2);
        out.println(r.getNum() == 2 && r.getDenom() == 1);
        r = new Rational(4, 9);
        out.println(r.getNum() == 4 && r.getDenom() == 9);
        r = new Rational(49, 168);
        out.println(r.getNum() == 7 && r.getDenom() == 24);  // Always shorted
        r = new Rational(20, 4);
        out.println(r.getNum() == 5 && r.getDenom() == 1);
        r = new Rational(0, 1);
        out.println(r.getNum() == 0 && r.getDenom() == 1);
        r = new Rational(-49, 168);
        out.println(r.getNum() == 7 && r.getDenom() == -24);
        r = new Rational(49, -168);
        out.println(r.getNum() == 7 && r.getDenom() == -24);
        r = new Rational(-49, -168);
        out.println(r.getNum() == 7 && r.getDenom() == 24);

        Rational r1 = new Rational(1, 4);
        Rational r2 = new Rational(1, 2);
        out.println(r1.add(r2).equals(new Rational(3, 4)));
        out.println(r1.sub(r2).equals(new Rational(-1, 4)));
        out.println(r1.mul(r2).equals(new Rational(1, 8)));
        out.println(r1.div(r2).equals(new Rational(1, 2)));

        Rational r3 = new Rational(r1);
        out.println(r3.equals(r1));
        out.println(!r3.lessThan(r1));
        out.println(abs(r3.toDouble() - 0.25) < 0.000001);

        List<Rational> rList = new ArrayList<>();
        rList.add(new Rational(2, 3));
        out.println(rList.contains(new Rational(2, 3)));

        Map<Rational, String> complexMsg = new HashMap<>();
        complexMsg.put(new Rational(1,1), "one");
        out.println(complexMsg.get(new Rational(1,1)).equals("one"));

        out.println(new Rational(6, 1).toString().equals("6 / 1"));
    }
}
    


