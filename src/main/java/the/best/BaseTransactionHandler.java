package the.best;

abstract public class BaseTransactionHandler implements TransactionHandler {

    TransactionHandler next;

    @Override
    public void setNext(TransactionHandler transactionHandler){
        next = transactionHandler;
    }

    @Override
    abstract public void handle(Double money);
}
