package the.best;

public class InternationalTaxTransactionHandler extends BaseTransactionHandler {

    @Override
    public void handle(Double money) {
        System.out.println("International tax handler");

        if(next != null){
            next.handle(money);
        }
    }
}
