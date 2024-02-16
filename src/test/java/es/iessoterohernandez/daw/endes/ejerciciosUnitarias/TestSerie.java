package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSerie {

    private Serie serie1, serie2;

    @BeforeEach
    public void obj() {
        serie1 = new Serie("Serie1", 5, "Drama", "Creador1");
        serie2 = new Serie("Serie2", 3, "Comedia", "Creador2");
    }

    @Test
    public void testEntregarYDevolver() {
        serie1.entregar();
        assertTrue(serie1.isEntregado());

        serie1.devolver();
        assertFalse(serie1.isEntregado());
    }

    @Test
    public void testCompareTo() {
        assertEquals(1, serie1.compareTo(serie2));
        assertEquals(0, serie1.compareTo(new Serie("Serie1", 5, "Drama", "Creador1")));
        assertEquals(-1, serie2.compareTo(serie1));
    }

    @Test
    public void testEquals() {
        assertTrue(serie1.equals(new Serie("Serie1", "Creador1")));
        assertFalse(serie1.equals(new Serie("Serie1", "Creador2")));
    }

    @Test
    public void testToString() {
        assertEquals("Informacion de la Serie: \n" +
                     "\tTitulo: Serie1\n" +
                     "\tNumero de temporadas: 5\n" +
                     "\tGenero: Drama\n" +
                     "\tCreador: Creador1", serie1.toString());

        assertEquals("Informacion de la Serie: \n" +
                     "\tTitulo: Serie2\n" +
                     "\tNumero de temporadas: 3\n" +
                     "\tGenero: Comedia\n" +
                     "\tCreador: Creador2", serie2.toString());
    }
}


