package exercises.ex2usemoreclasses;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;
import static java.lang.System.out;

/*
 *  This is a test of Classes (objects of) Point and Triangle
 *
 *  See
 *  - usemoreclasses
 */
public class Ex2TestPointTriangle {

    public static void main(String[] args) {
        new Ex2TestPointTriangle().test();
    }

    private void test() {
        // All should print true as usual
        // Point
        Point p = new Point(1, 2, 3);
        out.println(p.distance(new Point(p)) == 0);
        out.println(new Point(0, 0, 0).distance(new Point(1, 0, 0)) == 1);

        // Triangle uses Points!
        Triangle t = new Triangle(new Point(0, 0, 0), new Point(0, 1, 0), new Point(1, 0, 0));
        out.println(abs(t.area() - 0.5) < 0.000001);  // Area should be 0.5

        // Test data
        Point p1 = new Point(1, 1, 1);
        Point p2 = new Point(2, 2, 2);
        Point p3 = new Point(3, 3, 3);
        List<Triangle> trs = Arrays.asList(
                new Triangle(p1, p2, p3),
                new Triangle(p1, p3, p2),
                new Triangle(p2, p1, p3),
                new Triangle(p2, p3, p1));

        // Try to find triangle in list
        out.println(trs.contains(new Triangle(p1, p2, p3)));
        out.println(!trs.contains(new Triangle(p3, p1, p2)));
    }

}
