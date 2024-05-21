package metropolia.patricsc.suunnittelumallit.flyweight_program;

public class StringTest {
    public static void main(String[] args) {
        String fly = "fly", weight = "weight";
        String fly2 = "fly", weight2 = "weight";
        System.out.println(fly == fly2);
        System.out.println(weight == weight2);

        String distinctString = fly + weight;
        System.out.println(distinctString == "flyweight");
        String flyweight = (fly + weight).intern();
        System.out.println(flyweight == "flyweight");
    }
}
