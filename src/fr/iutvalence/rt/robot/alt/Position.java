package fr.iutvalence.rt.robot.alt;

public final class Position {
    public int x;
    public int y;

    public Position() {
        this(0, 0);
    }

    public Position(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
