package main.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    public Person test2;
    @BeforeEach
    void setUp() {
        test2= new Person("Susi", "Sorglos", 180, (byte)4);
    }

    @Test
    void rechneBMI() {
        String susiBMI = test2.rechneBMI(80);

        assertEquals("Normalgewicht", susiBMI);

    }

    @Test
    void printPerson() {
        String susiAktivitaetslvl = test2.printPerson(80);
        assertEquals(susiAktivitaetslvl, "Profisportler" );
    }
}