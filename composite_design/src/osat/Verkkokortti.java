package osat;

import interfaces.LaiteOsaIF;

public class Verkkokortti implements LaiteOsaIF {
    private float hinta;
    public Verkkokortti(float hinta) {
        this.hinta = hinta;
    }

    @Override
    public float annaHinta() {
        return this.hinta;
    }

    @Override
    public void lisaaOsa(LaiteOsaIF osa) {
        System.err.println("Cannot add a part to a NIC...");
    }
}
