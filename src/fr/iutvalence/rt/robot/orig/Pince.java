package fr.iutvalence.rt.robot.orig;

public class Pince {
    private boolean ouvert;

    public Pince() {
        ouvert = true;
    }

    public void ouvrir() {
        ouvert = true;
    }

    public void fermer() {
        ouvert = false;
    }

    @Override
    public String toString() {
        return "pince " + (ouvert ? "ouverte" : "fermé");
    }
}
