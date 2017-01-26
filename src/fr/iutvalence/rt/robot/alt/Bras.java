package fr.iutvalence.rt.robot.alt;

final class Bras {
    private final Pince   m_pince;
    private       boolean m_leve;

    Bras() {
        m_leve = false;
        m_pince = new Pince();
    }

    void lever() {
        m_leve = true;
    }

    void baisser() {
        m_leve = false;
    }

    void fermerPince() {
        m_pince.fermer();
    }

    void ouvrirPince() {
        m_pince.ouvrir();
    }

    @Override
    public String toString() {
        return String.format("bras %s et pince %s", m_leve ? "levé" : "baissé", m_pince);
    }
}
