package the.best;

public interface TransactionHandler {
    void setNext(TransactionHandler transactionHandler);
    void handle(Double money);
}
