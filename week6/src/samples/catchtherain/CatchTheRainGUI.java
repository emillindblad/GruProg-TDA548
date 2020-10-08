package samples.catchtherain;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

import static samples.catchtherain.Bucket.BUCKET_HEIGHT;
import static samples.catchtherain.Bucket.BUCKET_SPEED;
import static samples.catchtherain.CatchTheRain.GAME_HEIGHT;
import static samples.catchtherain.CatchTheRain.GAME_WIDTH;
import static samples.catchtherain.Ground.GROUND_HEIGHT;


/*
 *      A game for catching raindrops in a bucket
 *      This is the GUI
 *      To run the game run this
 *
 * See:
 * - asteroids/*
 */
public class CatchTheRainGUI extends Application {

    // Reference to OO -model
    private CatchTheRain ctr;

    // Called by timer
    void update(long now) {
        ctr.update(now);
    }

    // Called at start by FX
    @Override
    public void init() {
        // Create the OO model (RainDrops come and go)
        List<IPositionable> drops = new ArrayList<>();
        Bucket bucket = new Bucket(GAME_WIDTH / 2, GAME_HEIGHT - GROUND_HEIGHT - BUCKET_HEIGHT
                , Color.BLUE);
        Ground ground = new Ground(0, GAME_HEIGHT - GROUND_HEIGHT);
        ctr = new CatchTheRain(drops, ground, bucket);
    }

    // -- Handle keyboard -----------------------

    void handleKeyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case LEFT:
                ctr.setBucketSpeed(-BUCKET_SPEED);
                break;
            case RIGHT:
                ctr.setBucketSpeed(BUCKET_SPEED);
                break;
            default:
                ;
        }
    }

    void handleKeyReleased(KeyEvent event) {
        ctr.setBucketSpeed(0);
    }


    // ------------ JavaFX graphics etc.  -----------------------------

    private GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();
        Canvas canvas = new Canvas(GAME_WIDTH, GAME_HEIGHT);
        gc = canvas.getGraphicsContext2D();

        root.getChildren().addAll(canvas);

        AnimationTimer timer = new AnimationTimer() {
            public void handle(long now) {
                update(now);
                render();

            }
        };
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(this::handleKeyPressed);
        scene.setOnKeyReleased(this::handleKeyReleased);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Catch the Rain");
        primaryStage.show();

        timer.start();
    }

    void render() {
        gc.clearRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
        gc.setFill(Color.BLACK);
        gc.fillText("Points: " + ctr.getPoints(), 10, 20);
        IPositionable ground = ctr.getGround();
        gc.setFill(ground.getColor());
        gc.fillRect(ground.getX(), ground.getY(), ground.getWidth(), ground.getHeight());
        IPositionable bucket = ctr.getBucket();
        gc.setFill(bucket.getColor());
        gc.fillRect(bucket.getX(), bucket.getY(), bucket.getWidth(), bucket.getHeight());
        for (IPositionable d : ctr.getDrops()) {
            gc.setFill(d.getColor());
            gc.fillOval(d.getX(), d.getY(), d.getWidth(), d.getHeight());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
