package fr.iutvalence.rt.robot.alt;

final class Roue {
    private final int m_diametre;

    Roue(final int diametre) {
        m_diametre = diametre;
    }

    @Override
    public String toString() {
        return "roue de " + m_diametre + " cm";
    }
}
