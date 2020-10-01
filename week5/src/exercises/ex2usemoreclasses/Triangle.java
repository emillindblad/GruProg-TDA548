package exercises.ex2usemoreclasses;

import java.util.Arrays;
import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
      A class for a Triangle in 3D
      Should use Point class and Herons formula

      NOTE: No IO here, this is just the logical concept.

      To test run Ex2TestPointTriangle

*/
public class Triangle {

    private double sidea;
    private double sideb;
    private double sidec;

    public Triangle(Point a,Point b, Point c) {
        sidea =  b.distance(c); //dist b-c
        sideb =  a.distance(c); //dist a-c
        sidec = sqrt(pow(sidea, 2) + pow(sideb, 2));
    }

    public double area() {
        double s = (sidea + sideb + sidec) / 2.0;
        double area = sqrt(s*(s-sidea)*(s-sideb)*(s-sidec));
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sidea, sidea) == 0 &&
                Double.compare(triangle.sideb, sideb) == 0 &&
                Double.compare(triangle.sidec, sidec) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sidea, sideb, sidec);
    }
}

