package de.pplerngruppe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

public class RezeptRepositoryTest {

    @Test
    @DisplayName("Überprüfen, ob Rezept gefunden wird.")
    void test_8() {
        RezeptRepository rezeptRepository = new RezeptRepository();
        Rezept rezept1 = RezepteTemplate.ohneZubereitungMitMehrereZutaten();
        rezeptRepository.rezepte.add(rezept1);
        Rezept rezept2 = RezepteTemplate.eineZutat();
        rezeptRepository.rezepte.add(rezept2);
        List<Rezept> ergebnis = rezeptRepository.suchenRezeptname("Käsekuchen");
        assertThat(ergebnis).contains(rezept1);
    }
}
