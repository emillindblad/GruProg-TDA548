package samples.catchtherain;

/*

    Base class for anything that can be positioned in the world.
    This class holds common data and methods
 */
public abstract class AbstractPositionable implements IPositionable {

    private final double width;
    private final double height;
    private double x;      // x, y upper left corner
    private double y;

    public AbstractPositionable(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Nice utility method possibly useful for any positionable object
    public boolean intersects(AbstractPositionable other) {
        boolean above = other.getMaxY() < getY();
        boolean below = other.getY() > getMaxY();
        boolean leftOf = other.getMaxX() < getX();
        boolean rightOf = other.getX() > getMaxX();
        return !(above || below || leftOf || rightOf);
    }

    // Getters
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

    // Convenience
    public double getMaxX() {
        return x + width;
    }

    public double getMaxY() {
        return y + height;
    }
}
