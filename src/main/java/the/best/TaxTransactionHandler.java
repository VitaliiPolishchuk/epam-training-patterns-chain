package the.best;

public class TaxTransactionHandler extends BaseTransactionHandler {

    @Override
    public void handle(Double money) {
        System.out.println("Tax handler");

        if(next != null){
            next.handle(money);
        }
    }
}
