package fr.iutvalence.rt.robot.orig;

public class Roue {
    public int diametre;

    public Roue(int diametre) {
        this.diametre = diametre;
    }

    @Override
    public String toString() {
        return "roue de " + diametre + " cm";
    }
}
