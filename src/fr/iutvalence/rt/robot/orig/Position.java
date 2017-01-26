package fr.iutvalence.rt.robot.orig;

public class Position {
    public int x;
    public int y;

    public Position() {
        this(0, 0);
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ',' + y + ')';
    }
}
