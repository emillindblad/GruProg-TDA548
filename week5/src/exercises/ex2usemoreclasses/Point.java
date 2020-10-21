package exercises.ex2usemoreclasses;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*

  A class for points in 3D. Should be immutable

  NOTE: No IO here, this is just the logical concept.

  To test run Ex2TestPointTriangle

*/
public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(Point other) {
        this(other.x, other.y, other.z);
    }

    public int distance(Point other) {
        double dx = (double) this.x-other.x;
        double dy = (double) this.y-other.y;
        double dz = (double) this.z-other.z;
        int d = (int) sqrt(pow(dx,2.0)+pow(dy,2.0)+pow(dz,2.0));
        return d;

    }
}


