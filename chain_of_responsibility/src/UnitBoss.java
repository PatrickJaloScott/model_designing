public class UnitBoss extends Esimies {
    private final int RAISE_LIMIT = 5;

    @Override
    public void acceptRaiseRequest(RaiseRequest request) {
        if (request.getAmount() < RAISE_LIMIT) {
            System.out.printf("The Boss will accept your request of a %d%% raise\n", request.getAmount());
        } else {
            super.acceptRaiseRequest(request);
        }
    }
}