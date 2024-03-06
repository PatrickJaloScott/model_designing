public class Supervisor extends Esimies {
    @Override
    public void acceptRaiseRequest(RaiseRequest request) {
        if(request.getAmount() > BASE_RAISE) {
            super.acceptRaiseRequest(request);
        } else {
            System.out.printf("The supervisor will approve your request for %d%% pay raise\n", request.getAmount());
        }
    }
}