package exercises.ex2asteroids;

import java.util.Random;

/*
   Class representing the over all game
   Most of game logic here (nothing about the look here)

 */
public class Asteroids {

    public static final double GAME_WIDTH = 500;
    public static final double GAME_HEIGHT = 500;
    public static final long SEC = 1_000_000_000;

    // Other parts of OO model
    private Spaceship ship;
    private Asteroid oid;

    // Administration
    private int points;    // Not used
    private boolean gameOver = false;

    public Asteroids(Spaceship ship) { // Constructor will construct model
        this.ship = ship;
    }

    private long timeForLastHit;  // Use time supplied by JavaFX

    // Main game loop (called by timer in GUI)
    void update(long now) {
        ship.move();

        if (oid == null && now - timeForLastHit > SEC) {
            oid = createAsteroid();
            timeForLastHit = now;
        }
        if (oid != null) {
            oid.move();
            if (ship.intersects(oid)) {
                gameOver = true;
            }
            if (oid.getX() < 0 || GAME_WIDTH < oid.getX() ||
                    oid.getY() < 0 || GAME_HEIGHT < oid.getY()) {
                oid = null;
            }
        }
    }

    private Random rand = new Random();

    // Asteroid may come from all directions
    private Asteroid createAsteroid() {
        int dir = rand.nextInt(4);
        double x = 0;
        double y = 0;
        double dx = 4 - rand.nextInt(4);
        double dy = 4 - rand.nextInt(4);
        switch (dir) {
            case 0:
                x = -1;
                y = rand.nextInt((int) GAME_HEIGHT);
                if (rand.nextBoolean()) {
                    dy = -dy;
                }
                break;
            case 1:
                x = GAME_WIDTH + 1;
                dx = -dx;
                y = rand.nextInt((int) GAME_HEIGHT);
                if (rand.nextBoolean()) {
                    dy = -dy;
                }
                break;
            case 2:
                x = rand.nextInt((int) GAME_WIDTH);
                if (rand.nextBoolean()) {
                    dx = -dx;
                }
                y = -1;
                break;
            case 3:
                x = rand.nextInt((int) GAME_WIDTH);
                if (rand.nextBoolean()) {
                    dx = -dx;
                }
                y = GAME_HEIGHT + 1;
                dy = -dy;
                break;
            default:
                ;
        }
        double size = 50 - rand.nextInt(40);

        return new Asteroid(x, y, size, size, dx, dy);
    }


    // -------- Used by GUI --------------------

    public void stopShip() {
        ship.stop();
    }

    public void setShipSpeed(double dx, double dy) {
        ship.setDx(dx);
        ship.setDy(dy);
    }

    public Spaceship getShip() {
        return ship;
    }

    public Asteroid getAsteroid() {
        return oid;
    }

    public int getPoints() {
        return points;
    }

    public boolean isGameOver() {
        return gameOver;
    }
}
