package samples;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static java.lang.System.out;

/*
 *  Basic JavaFX for animation
 *
 *  Just for the curious, will not show up on exam!
 */
public class BasicJavaFX extends Application {

    double x = 0;    // Horizontal position

    long lastUpdateTime;   // Used for speed of animation

    // Called by a timer approx 60 times/sec.
    void update(long now) {
        if (now - lastUpdateTime > 200_000_000) {
            x = x + 1;        // Move it
            lastUpdateTime = now;
        }
    }

    // Called by a timer approx 60 times/sec.
    void render() {
        gc.clearRect(0, 0, 500, 500); // Graphic primitives (low level drawing)
        gc.setFill(Color.BLUE);
        gc.fillOval(x, 100, 50, 50);
    }

    // --------  JavaFX, setup graphics create a create a timer -----------------------

    GraphicsContext gc;   // Toolbox for drawing (on Canvas, see below)

    // Program starts here
    @Override
    public void start(Stage primaryStage) throws Exception {
        out.println("Start");

        Pane root = new Pane();
        Canvas canvas = new Canvas(500, 500);  // A Canvas is a drawing area
        root.getChildren().add(canvas);                      // Add drawing area to pane

        gc = canvas.getGraphicsContext2D();  // Get the toolbox for this drawing area

        // Create a timer
        AnimationTimer timer = new AnimationTimer() {      // If animating, time must pass
            @Override
            public void handle(long now) {  // This will be run approx. 60 times/sec. when started.
                update(now);   // Parameter 'now' automagically assigned by JavaFX using system clock
                render();
            }
        };

        Scene scene = new Scene(root);   // Add pane to scene
        primaryStage.setScene(scene);
        primaryStage.setTitle("Basic Java FX");
        primaryStage.show();
        timer.start();                       // Start animation.
    }


    public static void main(String[] args) {
        launch(args);
    }
}
