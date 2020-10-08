package samples.catchtherain;

import javafx.scene.paint.Color;

/*
    A class to collect falling rain drops into
    This is the object the player can move.
 */

public class Bucket extends AbstractPositionable {

    public static final double BUCKET_WIDTH = 40;
    public static final double BUCKET_HEIGHT = 40;
    public static final double BUCKET_SPEED = 3;

    private final Color color;
    private double dx;

    public Bucket(double x, double y, double width, double height, Color color) {
        super(x, y, width, height);
        this.dx = 0;
        this.color = color;
    }

    public Bucket(double x, double y, Color color){
        this(x,y, BUCKET_WIDTH, BUCKET_HEIGHT, color);// Default values
    }

    public void move() {
        setX(getX() + dx);
    }

    public void setDx(double dx){
        this.dx = dx;
    }

    public Color getColor() {
        return color;
    }
}

