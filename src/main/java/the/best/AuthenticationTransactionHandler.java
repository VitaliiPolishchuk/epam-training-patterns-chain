package the.best;

public class AuthenticationTransactionHandler extends BaseTransactionHandler {

    @Override
    public void handle(Double money) {

        System.out.println("Authentication handler");

        if(next != null){
            next.handle(money);
        }
    }
}
