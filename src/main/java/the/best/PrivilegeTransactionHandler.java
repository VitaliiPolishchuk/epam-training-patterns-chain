package the.best;

public class PrivilegeTransactionHandler extends BaseTransactionHandler {

    @Override
    public void handle(Double money) {
        System.out.println("Privilege handler");

        if(next != null){
            next.handle(money);
        }
    }
}
