package the.best;

public class FinishTransactionHandler extends BaseTransactionHandler {

    @Override
    public void handle(Double money) {

        System.out.println("Finish handler");

        if(next != null){
            next.handle(money);
        }
    }
}
