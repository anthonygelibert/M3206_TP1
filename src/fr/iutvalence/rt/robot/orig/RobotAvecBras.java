package fr.iutvalence.rt.robot.orig;

/**
 * Created by tony on 26/01/2017.
 */
public class RobotAvecBras extends Robot {
    private Bras bras;

    public RobotAvecBras() {
        super();
        bras = new Bras();
    }

    public RobotAvecBras(final int diametre) {
        super(diametre);
        bras = new Bras();
    }

    public RobotAvecBras(final int x, final int y, final int diametre) {
        super(x, y, diametre);
        bras = new Bras();
    }

    public void leverBras() {
        bras.lever();
    }

    public void baisserBras() {
        bras.baisser();
    }

    public void ouvrirPince() {
        bras.getPince().ouvrir();
    }

    public void fermerPince() {
        bras.getPince().fermer();
    }

    @Override
    public String toString() {
        return super.toString() + " avec " + bras + " et " + bras.getPince();
    }
}
