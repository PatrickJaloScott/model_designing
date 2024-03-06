public class ChiefExecutiveOfficer extends Esimies {
    private final int RAISE_LIMIT = 20;

    @Override
    public void acceptRaiseRequest(RaiseRequest request) {
        if (request.getAmount() < RAISE_LIMIT) {
            System.out.printf("The CEO has accepted your request for %d%% raise\n", request.getAmount());
        } else {
            System.out.println("The CEO needs to take time to review your request");
        }
    }
}