package osat;

import interfaces.LaiteOsaIF;

public class Prosessori implements LaiteOsaIF {
    private float hinta;
    public Prosessori(float hinta) {
        this.hinta = hinta;
    }

    @Override
    public float annaHinta() {
        return this.hinta;
    }

    @Override
    public void lisaaOsa(LaiteOsaIF osa) {
        System.err.println("Cannot add a part to a CPU...");
    }
}
