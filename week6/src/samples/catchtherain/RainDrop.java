package samples.catchtherain;

import javafx.scene.paint.Color;

/*
    A class for rain drops falling down
    (to be collected in the bucket or will hit the ground)
 */
public class RainDrop extends AbstractPositionable {

    private final Color color;
    private double dy;

    public RainDrop(double x, double y, double width, double height, double dy, Color color) {
        super(x, y, width, height);
        this.dy = dy;
        this.color = color;
    }

    public void move(){
        setY(getY() + dy);
    }

    public double getDy() {
        return dy;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
