import java.util.ArrayList;

/**
 * Created by sushantathley on 11/21/15.
 */
public class TransactionStoreImplementation implements TransactionStore {

    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();


    public void SaveTransaction(Transaction transaction)
    {
        transactions.add(transaction);
    }

}
