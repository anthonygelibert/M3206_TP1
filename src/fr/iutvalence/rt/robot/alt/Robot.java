package fr.iutvalence.rt.robot.alt;

public class Robot {
    private final Roue[]   m_mesRoues;
    private final Position m_position;

    private Orientation m_orientation = Orientation.NORD;

    public Robot() {
        this(0, 0, 10);
    }

    public Robot(final int diametre) {
        this(0, 0, diametre);
    }

    public Robot(final int x, final int y, final int diametre) {
        m_position = new Position(x, y);
        m_mesRoues = new Roue[]{new Roue(diametre), new Roue(diametre)};
    }

    public void tournerDroite() {
        m_orientation = Orientation.valueOf(m_orientation.rotDroite);
    }

    public Position getPosition() {
        return m_position;
    }

    public void avancer() {
        m_position.x += m_orientation.dX;
        m_position.y += m_orientation.dY;
    }

    @Override
    public String toString() {
        return "Robot en position équipé de " + m_mesRoues[0] + " et positionné en " + m_position;
    }
}
