import interfaces.LaiteOsaIF;
import osat.*;

public class Main {
    public static void main(String[] args) {
        LaiteOsaIF ram = new Muistipiiri(35),
                motherboard = new Emolevy(75),
                storage = new Muistilevy(50),
                cpu = new Prosessori(105),
                nic = new Verkkokortti(115),
                gpu = new Naytonohjain(150),
                cover = new Kotelo(45),
                power = new Virtalahde(60);

        motherboard.lisaaOsa(storage);
        motherboard.lisaaOsa(cpu);
        motherboard.lisaaOsa(ram);
        motherboard.lisaaOsa(gpu);
        motherboard.lisaaOsa(nic);

        cover.lisaaOsa(motherboard);
        cover.lisaaOsa(power);

        storage.lisaaOsa(storage);
        cpu.lisaaOsa(gpu);
        ram.lisaaOsa(storage);

        System.out.printf("CPU: %s$, GPU: %s$\n", cpu.annaHinta(), gpu.annaHinta());
        System.out.println("Emolevyn hinta liitettyine komponenttineen: " + motherboard.annaHinta() + "$");
        System.out.println("Koneen koko hinta: " + cover.annaHinta() + "$");
    }
}