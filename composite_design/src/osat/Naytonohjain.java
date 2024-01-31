package osat;

import interfaces.LaiteOsaIF;

public class Naytonohjain implements LaiteOsaIF {
    private float hinta;
    public Naytonohjain(float hinta) {
        this.hinta = hinta;
    }

    @Override
    public float annaHinta() {
        return this.hinta;
    }

    @Override
    public void lisaaOsa(LaiteOsaIF osa) {
        System.err.println("Cannot add a part to a graphics card...");
    }
}
