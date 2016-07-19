package manager;

import model.Transaction;

/**
 * Created by sushantathley on 11/21/15.
 */
public interface BankStore {

    public void SaveTransaction(Transaction transaction);


}
