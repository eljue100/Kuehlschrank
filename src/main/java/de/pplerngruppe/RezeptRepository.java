package de.pplerngruppe;

import java.util.ArrayList;
import java.util.List;

public class RezeptRepository {
    public List<Rezept> rezepte = new ArrayList<>();

//    public void printRezept(){
//        String rezept = "";
//        for (Rezept r:rezepte) {
//            rezept+=
//            r.getName();
//        }


    public List<Rezept> suchenRezeptname (String rezeptname){
        //boolean vorhanden= rezepte.stream().anyMatch(x -> x.getName().equals(rezeptname));
        return rezepte.stream().filter(x -> x.getName().equals(rezeptname)).toList();



    }


}
