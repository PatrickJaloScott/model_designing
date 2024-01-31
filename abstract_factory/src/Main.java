public class Main {
    public static void main(String[] args) {
        AbstractClothingFactory adidasClothingFactory = new AdidasClothingFactory();
        adidasClothingFactory.pue();
        adidasClothingFactory.luettele();
        AbstractClothingFactory bossClothingFactory = new BossClothingFactory();
        bossClothingFactory.pue();
        bossClothingFactory.luettele();

        System.out.println(MathPolynomial.polynomial(3, 2, 2));
    }
}