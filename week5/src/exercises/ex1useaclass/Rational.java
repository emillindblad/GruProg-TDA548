package exercises.ex1useaclass;

import samples.usestatic.A;

import java.util.Objects;

import static java.lang.Math.abs;

/*
 *    A class representing a rational number
 *
 *    NOTE: No IO here, this is just the logical concept.
 *
 *    Test the class by running Ex1TestRational.
 *
 * See:
 * - useaclass/
 * - UseAMap
 */

public class Rational {

    private final int num;    // rational =  num / denom
    private final int denom;

    public Rational(int num) {
        this(num, 1);
    }

    public Rational(int num, int denom) {
        this.num = num / gcd(num,denom);
        this.denom = denom / gcd(num,denom);
    }

    public Rational(Rational other) {
        this(other.num, other.denom);
    }

    int gcd(int num, int denom) {
        if (denom == 0) {
            return num;
        }
        else {
            return gcd(denom, (num % denom));
        }
    }

    public Rational add(Rational other) {
       return new Rational(this.num * other.denom + other.num * this.denom, this.denom * other.denom);
    }

    public Rational sub(Rational other) {
        return new Rational(this.num * other.denom - other.num * this.denom, this.denom * other.denom);
    }

    public Rational mul(Rational other) {
        return new Rational(this.num * other.num, this.denom * other.denom);
    }

    public Rational div(Rational other) {
        return new Rational(this.num / other.num, this.denom / other.denom);
    }

    double toDouble() {
        return (double) num / denom;
    }

    Boolean lessThan(Rational other) {
        int y = this.num * other.denom  - this.denom * other.num;
        if (y > 0) {
            return true;
        }
        return false;
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    @Override
    public String toString() {
        return "" + num + " / " + denom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return num == rational.num &&
                denom == rational.denom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, denom);
    }
}

