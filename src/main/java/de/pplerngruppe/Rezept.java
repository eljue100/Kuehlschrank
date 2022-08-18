package de.pplerngruppe;

import java.util.ArrayList;
import java.util.List;

public class Rezept {
    private List<Zutat> zutaten = new ArrayList<>();

//    public Rezept()
    public void addZutat(Zutat zutat) {
        zutaten.add(zutat);
    }

    public List<Zutat> getZutaten() {
        return zutaten;
    }
}
