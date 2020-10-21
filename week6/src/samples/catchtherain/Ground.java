package samples.catchtherain;

import javafx.scene.paint.Color;

import static samples.catchtherain.CatchTheRain.GAME_WIDTH;

/*
        The ground the bucket is standing (moving) on.
 */
public class Ground extends AbstractPositionable {

    public static final double GROUND_HEIGHT = 10;
    private final Color color;

    public Ground(double x, double y, double width, double height, Color color) {
        super(x, y, width, height);
        this.color = color;
    }

    public Ground(double x, double y) {
        this(x, y, GAME_WIDTH, GROUND_HEIGHT, Color.BROWN); // Default values
    }

    @Override
    public Color getColor() {
        return color;
    }
}
