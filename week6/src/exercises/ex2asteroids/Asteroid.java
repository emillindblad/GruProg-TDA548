package exercises.ex2asteroids;

/*
    Class representing a single Asteroid

 */
public class Asteroid {

    private double x;      // x, y upper left corner
    private double y;
    private final double width;
    private final double height;
    private double dx;   // Speed
    private double dy;

    public Asteroid(double x, double y, double width, double height, double dx, double dy) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.dx = dx;
        this.dy = dy;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getMaxX() {
        return x + width;
    }

    public double getMaxY() {
        return y + height;
    }
}