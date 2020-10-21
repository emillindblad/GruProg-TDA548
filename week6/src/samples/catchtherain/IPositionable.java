package samples.catchtherain;

import javafx.scene.paint.Color;

/*
    All objects the GU shall render must implement this
    (so that the GUI is able to position it and know the size)
 */
public interface IPositionable {

    double getX();      // MinX and Y is upper left corner (y-axis pointing donw)

    double getY();

    double getWidth();

    double getHeight();

    Color getColor();  // We just use colors for this game (i.e. no images)

}
