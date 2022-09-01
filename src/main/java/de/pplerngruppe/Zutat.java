package de.pplerngruppe;

public class Zutat {
    private String name;
    private Menge menge;

    public Zutat(String name, Menge menge) {
        this.name=name;
        this.menge=menge;
    }

    public String getName() {
        return name;
    }
}
