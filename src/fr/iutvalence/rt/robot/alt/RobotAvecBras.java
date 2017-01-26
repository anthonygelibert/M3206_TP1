package fr.iutvalence.rt.robot.alt;

public final class RobotAvecBras extends Robot {
    private final Bras m_bras;

    public RobotAvecBras() {
        super();
        m_bras = new Bras();
    }

    public RobotAvecBras(final int diametre) {
        super(diametre);
        m_bras = new Bras();
    }

    public RobotAvecBras(final int x, final int y, final int diametre) {
        super(x, y, diametre);
        m_bras = new Bras();
    }

    public void leverBras() {
        m_bras.lever();
    }

    public void baisserBras() {
        m_bras.baisser();
    }

    public void ouvrirPince() { m_bras.ouvrirPince(); }

    public void fermerPince() {
        m_bras.fermerPince();
    }

    @Override
    public String toString() {
        return super.toString() + " avec " + m_bras + " et " + m_bras;
    }
}
