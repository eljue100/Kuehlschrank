package de.pplerngruppe;

import java.util.ArrayList;
import java.util.List;

public class Rezept {
    private String name;
    private String zubereitung;
    private List<Zutat> zutaten = new ArrayList<>();

    public Rezept(String name) {
        this.name = name;
    }

    public Rezept(String name, List<Zutat> zutaten) {
        this.name = name;
        this.zutaten = zutaten;
    }

    public void setZubereitung(String zubereitung) {
        this.zubereitung = zubereitung;
    }

    public void add(Zutat zutat) {
        zutaten.add(zutat);
    }

    public List<Zutat> getZutaten() {
        return zutaten;
    }

    @Override
    public String toString() {
        String rezeptausgabe = "Rezept: "+name+", Zutaten: ";

        if (zutaten.isEmpty() && zubereitung == null) {
            return getName() + "ist leer.";
        }
        else {

            for (Zutat zutat : getZutaten()) {
                rezeptausgabe += zutat.getName();
                rezeptausgabe += ", ";
            }

            if (zubereitung != null){
                rezeptausgabe += "Zubereitung: ";
                rezeptausgabe += zubereitung;
            }
        }

        return rezeptausgabe;
    }

//        else return "Rezept{" + "Name= "+ name+"\n zutaten= " + zutaten + "Zubereitung= " + zubereitung+ '}';
//    }

    private String getName() {
        return name;
    }

}
