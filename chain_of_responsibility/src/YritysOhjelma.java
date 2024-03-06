import java.util.Scanner;

public class YritysOhjelma {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Supervisor supervisor = new Supervisor();
        UnitBoss boss = new UnitBoss();
        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
        supervisor.setSeuraava(boss);
        boss.setSeuraava(ceo);

        try {
            while (true) {
                System.out.print("Enter amount to request for pay raise as whole percentage: ");
                RaiseRequest raiseAmount = new RaiseRequest(userInput.nextInt());
                supervisor.acceptRaiseRequest(raiseAmount);
            }
        } catch (Exception e) {
            System.exit(1);
        }
        userInput.close();
    }
}