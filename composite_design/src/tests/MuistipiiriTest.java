package tests;

import osat.Muistipiiri;

import static org.junit.jupiter.api.Assertions.*;

class MuistipiiriTest {

    Muistipiiri ram;
    @org.junit.jupiter.api.Test
    void annaHinta() {
        ram = new Muistipiiri(55);
        assertEquals(ram.annaHinta(), 55);
    }
}