package osat;

import interfaces.LaiteOsaIF;

public class Muistipiiri implements LaiteOsaIF {
    private float hinta;
    public Muistipiiri(float hinta) {
        this.hinta = hinta;
    }

    @Override
    public float annaHinta() {
        return this.hinta;
    }

    @Override
    public void lisaaOsa(LaiteOsaIF osa) {
        System.err.println("Cannot add a part to a memory component...");
    }
}
