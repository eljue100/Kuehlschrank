package de.pplerngruppe;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

public class RezeptTest {

    @Test
    @DisplayName("Ein Zutat wird zum Rezept hinzugefügt")
    void test_1(){
        Rezept rezept=new Rezept();
        Zutat zutat=mock(Zutat.class);
        rezept.add(zutat);
        assertThat(rezept.getZutaten()).contains(zutat);
    }
    @Test
    @DisplayName("Rezept hat zwei Zutaten")
    void test_2(){
        Rezept rezept=new Rezept();
        Zutat zutat1 = mock(Zutat.class);
        rezept.add(zutat1);
        Zutat zutat2 = mock(Zutat.class);
        rezept.add(zutat2);
        assertThat(rezept.getZutaten()).contains(zutat1,zutat2);
    }
    @Test
    @DisplayName("überprüfen, ob Rezept gespeichert wurde")
    void test_3(){
     Rezept rezept1=new Rezept();
     RezeptRepository rezeptRepository = new RezeptRepository();
     rezeptRepository.rezepte.add(rezept1);
     assertThat(rezeptRepository.rezepte).contains(rezept1);
    }
    @Test
    @DisplayName("ein leeres Rezept wird korrekt ausgegeben")
    void test_4(){
        Rezept rezept=new Rezept();
        assertThat(rezept.toString()).isEqualTo("");
    }



//
//    @Test
//    @DisplayName("")
//    void test_2(){
//        Zutat zutat=new Zutat();
//
//    }
//
//    @Test
//    @DisplayName("")
//    void test_3(){
//
//
//    }

}
