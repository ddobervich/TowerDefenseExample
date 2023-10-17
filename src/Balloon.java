import processing.core.PApplet;

public class Balloon {
    private float x, y;
    private float width, height;
    private float xSpeed;

    public Balloon(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.xSpeed = 1;
    }

    public void draw(PApplet window) {
        window.fill(255, 0, 0);                 // TODO: set color as attribute later
        window.ellipse(x, y, width, height);
    }

    public void updatePosition() {
        x += xSpeed;
    }
}
