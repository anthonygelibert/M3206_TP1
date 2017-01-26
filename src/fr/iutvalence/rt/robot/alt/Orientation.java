package fr.iutvalence.rt.robot.alt;

enum Orientation {
    NORD(0, 1, "EST"), EST(1, 0, "SUD"), SUD(0, -1, "OUEST"), OUEST(-1, 0, "NORD");

    public int    dX;
    public int    dY;
    public String rotDroite;

    Orientation(final int dX, final int dY, final String rotDroite) {
        this.dX = dX;
        this.dY = dY;
        this.rotDroite = rotDroite;
    }
}
