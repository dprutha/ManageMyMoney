/**
 * Created by sushantathley on 11/21/15.
 */
public class ServiceImplementation implements Service {

    private TransactionStore transactionStore = new TransactionStoreImplementation();

    public void Transaction(Transaction transaction) {
        transactionStore.SaveTransaction(transaction);
    }
}
