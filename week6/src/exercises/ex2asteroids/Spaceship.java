package exercises.ex2asteroids;


/*
    Class representing a Spaceship

 */
public class Spaceship {
    public static final double MAX_DX = 2;
    public static final double MAX_DY = 2;

    private double x;      // x, y upper left corner
    private double y;
    private final double width;
    private final double height;

    private double dx;   // Speed
    private double dy;

    public Spaceship(double x, double y, double width, double height, double dx, double dy) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.dx = dx;
        this.dy = dy;
    }

    public Spaceship(double x, double y, int width, int height) {
        this(x, y, width, height, 0, 0);
    }


    public boolean intersects(Asteroid asteroid) {
        boolean above = asteroid.getMaxY() < getY();
        boolean below = asteroid.getY() > getMaxY();
        boolean leftOf = asteroid.getMaxX() < getX();
        boolean rightOf = asteroid.getX() > getMaxX();
        return !(above || below || leftOf || rightOf);
    }

    public void stop() {
        dx = dy = 0;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public void setDy(double dy) {
        this.dy = dy;
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
