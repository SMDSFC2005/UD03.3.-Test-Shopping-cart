package es.iessoterohernandez.daw.endes.ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVideojuego {

    private Videojuego juego1, juego2;

    @BeforeEach
    public void obj() {
        juego1 = new Videojuego("Juego1", 120, "Acción", "Compañia1");
        juego2 = new Videojuego("Juego2", 100, "Aventura", "Compañia2");
    }

    @Test
    public void testEntregarYDevolver() {
        juego1.entregar();
        assertTrue(juego1.isEntregado());

        juego1.devolver();
        assertFalse(juego1.isEntregado());
    }

    @Test
    public void testCompareTo() {
        assertEquals(1, juego1.compareTo(juego2));
        assertEquals(0, juego1.compareTo(new Videojuego("Juego1", 120, "Acción", "Compañia1")));
        assertEquals(-1, juego2.compareTo(juego1));
    }

    @Test
    public void testEquals() {
        assertTrue(juego1.equals(new Videojuego("Juego1", "Compañia1")));
        assertFalse(juego1.equals(new Videojuego("Juego1", "Compañia2")));
    }

    @Test
    public void testToString() {
        assertEquals("Informacion del videojuego: \n" +
                     "\tTitulo: Juego1\n" +
                     "\tHoras estimadas: 120\n" +
                     "\tGenero: Acción\n" +
                     "\tcompañia: Compañia1", juego1.toString());

        assertEquals("Informacion del videojuego: \n" +
                     "\tTitulo: Juego2\n" +
                     "\tHoras estimadas: 100\n" +
                     "\tGenero: Aventura\n" +
                     "\tcompañia: Compañia2", juego2.toString());
    }
}

