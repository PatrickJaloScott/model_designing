package osat;

import interfaces.LaiteOsaIF;
import java.util.ArrayList;
import java.util.List;

public class Kotelo implements LaiteOsaIF {
    private float hinta;
    private List<LaiteOsaIF> osaLista = new ArrayList<>();

    public Kotelo(float hinta) {
        this.hinta = hinta;
    }

    @Override
    public float annaHinta() {
        float osienHinta = 0;
        for(LaiteOsaIF osa : osaLista) {
            osienHinta += osa.annaHinta();
        }
        return this.hinta + osienHinta;
    }

    @Override
    public void lisaaOsa(LaiteOsaIF osa) {
        osaLista.add(osa);
    }
}
