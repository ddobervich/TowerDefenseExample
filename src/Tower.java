import processing.core.PApplet;

public class Tower {
    private float x, y;
    private float width, height;
    private int hp;

    public Tower(float x, float y, float width, float height, int hp) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.hp = hp;
    }

    public void draw(PApplet window) {
        window.fill(200, 185, 200);
        window.rect(x, y, width, height);
    }
}
