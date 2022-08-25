package de.pplerngruppe;

import java.util.ArrayList;
import java.util.List;

public class Rezept {
    private String name;
    private String zubereitung;
    private List<Zutat> zutaten = new ArrayList<>();

  //  public Rezept(Zubereitung zubereitung) { this.zubereitung = zubereitung; }

    public void add(Zutat zutat) {
        zutaten.add(zutat);
    }

    public List<Zutat> getZutaten() {return zutaten;}

    @Override
    public String toString() {
        if (name==null && zutaten.isEmpty() && zubereitung==null){
            return "";}
        else return "Rezept{" + "Name= "+ name+"\n zutaten= " + zutaten + "Zubereitung= " + zubereitung+ '}';

    }

}
