import processing.core.PApplet;

import java.util.ArrayList;

public class Game extends PApplet {
    private ArrayList<Tower> towers;
    private ArrayList<Balloon> balloons;
    private int balloonSpawnInterval = 80;  // every 80 frames
    private int balloonSpawnTimer = balloonSpawnInterval;

    public void settings() {
        size(800, 800);   // set the window size

    }

    public void setup() {
        towers = new ArrayList<>();
        balloons = new ArrayList<>();
        
        initBalloons(1);
        initTowers(5);
    }

    private void initTowers(int num) {
        for (int i = 0; i < num; i++) {
            int spacing = width/num;
            Tower t1 = new Tower(i*spacing + 100, 250, 50,50, 10);
            Tower t2 = new Tower(i*spacing + 100, 500, 50,50, 10);
            towers.add(t1);
            towers.add(t2);
        }
    }

    private void initBalloons(int num) {
        for (int i = 0; i < num; i++) {
            float x = 30;
            float y = height/2;
            Balloon b = new Balloon(x, y, 40, 60);
            balloons.add(b);
        }
    }

    public void draw() {
        background(255);    // paint screen white
        balloonSpawnTimer--;

        if (balloonSpawnTimer <= 0) {
            Balloon b = new Balloon(-30, height/2, 40, 60);
            balloons.add(b);
            balloonSpawnTimer = balloonSpawnInterval;
        }

        // draw road
        fill(0,255,0);          // load green paint color
        rect(0, height/2 - 100, width, 200);

        for (Balloon b : balloons) {
            b.updatePosition();
        }

        for (Balloon b : balloons) {
            b.draw(this);
        }

        for (Tower t : towers) {
            t.draw(this);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
