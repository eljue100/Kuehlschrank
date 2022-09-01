package de.pplerngruppe;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

public class RezeptTest {


    @Test
    @DisplayName("Ein Zutat wird zum Rezept hinzugefügt")
    void test_1() {
        Rezept rezept = RezepteTemplate.eineZutat();
        //Zutat zutat=mock(Zutat.class);
        //rezept.add(zutat);
        assertThat(rezept.getZutaten()).hasSize(1);
    }

    @Test
    @DisplayName("Rezept hat zwei Zutaten")
    void test_2() {
        Rezept rezept = RezepteTemplate.ohneZubereitungMitMehrereZutaten();
        //Zutat zutat1 = mock(Zutat.class);
        //rezept.add(zutat1);
        //Zutat zutat2 = mock(Zutat.class);
        //rezept.add(zutat2);
        assertThat(rezept.getZutaten()).hasSize(2);
    }

    @Test
    @DisplayName("überprüfen, ob Rezept gespeichert wurde")
    void test_3() {
        Rezept rezept = RezepteTemplate.ohneZubereitungMitMehrereZutaten();
        RezeptRepository rezeptRepository = new RezeptRepository();
        rezeptRepository.rezepte.add(rezept);
        assertThat(rezeptRepository.rezepte).contains(rezept);
    }

    @Test
    @DisplayName("ein leeres Rezept wird korrekt ausgegeben")
    void test_4() {
        Rezept rezept = RezepteTemplate.leeresRezept();
        assertThat(rezept.toString()).contains("ist leer.");
    }

    @Test
    @DisplayName("Rezept mit Name und Zutat ohne Zubereitung")
    void test_5() {
        Rezept rezept = RezepteTemplate.ohneZubereitungMitMehrereZutaten();
        assertThat(rezept.toString()).contains("Rezept: Käsekuchen, Zutaten: Käse, Kuchen, ");
    }

    @Test
    @DisplayName("Rezept mit Name und Zutat mit Zubereitung")
    void test_6() {
        Rezept rezept = RezepteTemplate.zubereitungMitMehrereZutaten();
        assertThat(rezept.toString()).contains("Rezept: Käsekuchen, Zutaten: Käse, Kuchen, Zubereitung: Mischen");
    }

    @Test
    @DisplayName("Überprüfen, ob 2 Rezepte gespeichert wurden.")
    void test_7() {
        RezeptRepository rezeptRepository = new RezeptRepository();
        Rezept rezept1 = RezepteTemplate.ohneZubereitungMitMehrereZutaten();
        rezeptRepository.rezepte.add(rezept1);
        Rezept rezept2 = RezepteTemplate.eineZutat();
        rezeptRepository.rezepte.add(rezept2);
        assertThat(rezeptRepository.rezepte).contains(rezept1).contains(rezept2);
    }



}


