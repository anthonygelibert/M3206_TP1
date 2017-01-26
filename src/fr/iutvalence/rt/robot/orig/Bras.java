package fr.iutvalence.rt.robot.orig;

public class Bras {
    private Pince pince;
    private boolean leve;

    public Bras() {
        leve = false;
        pince = new Pince();
    }

    public void lever() {
        leve = true;
    }

    public void baisser() {
        leve = false;
    }

    public Pince getPince() {
        return pince;
    }

    @Override
    public String toString() {
        return "bras " + (leve ? "levé" : "baissé");
    }
}
