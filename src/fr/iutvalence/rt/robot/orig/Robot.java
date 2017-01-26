package fr.iutvalence.rt.robot.orig;

public class Robot {
    public static final int NORD  = 1;
    public static final int OUEST = 2;
    public static final int SUD   = 3;
    public static final int EST   = 4;

    private int orientation = NORD;
    private Position position;
    private Roue[]   mesRoues;

    public Robot() {
        this(0, 0, 10);
    }

    public Robot(int diametre) {
        this(0, 0, diametre);
    }

    public Robot(int x, int y, int diametre) {
        position = new Position(x, y);
        mesRoues = new Roue[2];
        mesRoues[0] = new Roue(diametre);
        mesRoues[1] = new Roue(diametre);
    }

    public void tournerDroite() {
        switch (orientation) {
            case NORD:
                orientation = EST;
                break;
            case EST:
                orientation = SUD;
                break;
            case SUD:
                orientation = OUEST;
                break;
            case OUEST:
                orientation = NORD;
                break;
        }
    }

    public Position getPosition() {
        return position;
    }

    public void avancer() {
        switch (orientation) {
            case NORD:
                position.y++;
                break;
            case EST:
                position.x++;
                break;
            case SUD:
                position.y--;
                break;
            case OUEST:
                position.x--;
                break;
        }
    }

    @Override
    public String toString() {
        return "Robot en position équipé de " + mesRoues[0] + " et positionné en " + position;
    }
}
