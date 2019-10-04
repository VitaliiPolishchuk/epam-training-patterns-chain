package the.best;

public class Main {
    public static void main(String[] args) {
        Double result = 10.00;
        getInnerTransaction().handle(result);
    }

    private static TransactionHandler getDefaultTransaction(){
        TransactionHandler authentication = new AuthenticationTransactionHandler();
        TransactionHandler taxHandler = new TaxTransactionHandler();
        TransactionHandler complete = new FinishTransactionHandler();

        authentication.setNext(taxHandler);
        taxHandler.setNext(complete);

        return authentication;
    }

    private static TransactionHandler getPrivilageTransaction(){
        TransactionHandler authentication = new AuthenticationTransactionHandler();
        TransactionHandler privilageHandler = new PrivilegeTransactionHandler();
        TransactionHandler complete = new FinishTransactionHandler();

        authentication.setNext(privilageHandler);
        privilageHandler.setNext(complete);

        return authentication;
    }

    private static TransactionHandler getInternationalTransaction(){
        AuthenticationTransactionHandler authentication = new AuthenticationTransactionHandler();
        TaxTransactionHandler taxHandler = new TaxTransactionHandler();
        InternationalTaxTransactionHandler internationalTaxTransactionHandler = new InternationalTaxTransactionHandler();
        FinishTransactionHandler complete = new FinishTransactionHandler();

        authentication.setNext(taxHandler);
        taxHandler.setNext(internationalTaxTransactionHandler);
        internationalTaxTransactionHandler.setNext(complete);

        return authentication;
    }

    private static TransactionHandler getInnerTransaction(){
        TransactionHandler authentication = new AuthenticationTransactionHandler();
        TransactionHandler complete = new FinishTransactionHandler();

        authentication.setNext(complete);

        return authentication;
    }
}
