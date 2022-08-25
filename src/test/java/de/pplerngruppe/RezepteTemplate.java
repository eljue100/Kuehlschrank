package de.pplerngruppe;

public class RezepteTemplate {

    public static Rezept leeresRezept(){
        return new Rezept("leeres Rezept");
    }

    public static Rezept eineZutat(){
        Zutat zutat = new Zutat("Wasser",new Menge(200));
        Rezept rezept = new Rezept("WasserRezept");
        rezept.add(zutat);
        return rezept;
    }

    public static Rezept ohneZubereitungMitMehrereZutaten(){
        Zutat zutat1 = new Zutat("Käse",new Menge(400));
        Zutat zutat2 = new Zutat("Kuchen",new Menge(100));
        Rezept rezept = new Rezept("Käsekuchen");
        rezept.add(zutat1);
        rezept.add(zutat2);
        return rezept;
    }

    public static Rezept zubereitungMitMehrereZutaten(){
        Zutat zutat1 = new Zutat("Käse",new Menge(500));
        Zutat zutat2 = new Zutat("Kuchen",new Menge(300));
        Rezept rezept = new Rezept("Käsekuchen");
        rezept.add(zutat1);
        rezept.add(zutat2);
        rezept.setZubereitung("Mischen");
        return rezept;
    }

}
