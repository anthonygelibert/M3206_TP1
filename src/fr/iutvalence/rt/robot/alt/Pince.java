package fr.iutvalence.rt.robot.alt;

final class Pince {
    private boolean m_ouvert;

    Pince() {
        m_ouvert = true;
    }

    void ouvrir() {
        m_ouvert = true;
    }

    void fermer() {
        m_ouvert = false;
    }

    @Override
    public String toString() {
        return m_ouvert ? "ouverte" : "fermé";
    }
}
