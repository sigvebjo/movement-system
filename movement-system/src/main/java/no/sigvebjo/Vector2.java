package no.sigvebjo;

public class Vector2 {
    private int varX;
    private int varY;

    public Vector2(int x, int y) {
        this.varX = x;
        this.varY = y;
    }

    public int x() {
        return this.varX;
    }

    public int y() {
        return this.varY;
    }

    public void add(Vector2 other) {
        this.varX += other.x();
        this.varY += other.y();
    }

    @Override
    public String toString() {
        return "(" + this.varX + ", " + this.varY + ")";
    }
}
