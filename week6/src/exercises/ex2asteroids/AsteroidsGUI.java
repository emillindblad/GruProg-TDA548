package exercises.ex2asteroids;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static exercises.ex2asteroids.Asteroids.GAME_HEIGHT;
import static exercises.ex2asteroids.Asteroids.GAME_WIDTH;
import static exercises.ex2asteroids.Spaceship.MAX_DX;
import static exercises.ex2asteroids.Spaceship.MAX_DY;
import static javafx.scene.paint.Color.*;


/*
 *   The GUI for the Asteroid application (model)
 *
 *   No game logic here!
 *
 *   See:
 *   - catchtherain
 */
public class AsteroidsGUI extends Application {

    // The OO model
    private Asteroids asteroids;

    // Called by timer
    private void update(long now) {
        asteroids.update(now);
    }

    // Called first of all
    @Override
    public void init() {
        // Create OO - model
        Spaceship s = new Spaceship(GAME_WIDTH / 2, GAME_HEIGHT / 2, 20, 20);
        asteroids = new Asteroids(s);
    }

    // --------------- Keyboard handling ------------------------------

    void handleKeyPressed(KeyEvent event) {

        switch (event.getCode()) {
            case LEFT:
                asteroids.setShipSpeed(-MAX_DX, 0);
                break;
            case RIGHT:
                asteroids.setShipSpeed(MAX_DX, 0);
                break;
            case UP:
                asteroids.setShipSpeed(0, -MAX_DY);
                break;
            case DOWN:
                asteroids.setShipSpeed(0, MAX_DY);
                break;
            default:
                ;
        }
    }

    void handleKeyReleased(KeyEvent event) {
        asteroids.stopShip();
    }

    // --------  JavaFX Graphics rendering etc. -----------------------

    // Called by timer
    private void render() {
        gc.clearRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
        gc.setFill(BLACK);
        gc.fillText("Points: " + asteroids.getPoints(), 10, 20);

        Spaceship ship = asteroids.getShip();
        gc.setFill(BLUE);
        gc.fillRect(ship.getX(), ship.getY(), ship.getWidth(), ship.getHeight());
        Asteroid oid = asteroids.getAsteroid();
        if (oid != null) {
            gc.setFill(RED);
            gc.fillOval(oid.getX(), oid.getY(), oid.getWidth(), oid.getHeight());
        }
        if (asteroids.isGameOver()) {
            gc.setFont(new Font(20));
            gc.fillText("GAME OVER", GAME_WIDTH / 2 - 100, GAME_HEIGHT / 2);
            timer.stop();
        }
    }

    private GraphicsContext gc;
    private AnimationTimer timer;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Canvas canvas = new Canvas(GAME_WIDTH, GAME_HEIGHT);
        gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);

        timer = new AnimationTimer() {
            public void handle(long now) {
                update(now);
                render();
            }
        };

        Scene scene = new Scene(root);
        scene.setOnKeyPressed(this::handleKeyPressed);
        scene.setOnKeyReleased(this::handleKeyReleased);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Asteroids");
        primaryStage.show();
        timer.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
