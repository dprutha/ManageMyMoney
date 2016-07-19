package manager;

import model.Transaction;

import java.util.ArrayList;

/**
 * Created by sushantathley on 11/21/15.
 */
public class BankStoreImplementation implements BankStore {

    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private SubscriptionStore subscriptionStore = new SubscriptionStoreImplementation();

    public void SaveTransaction(Transaction transaction) {
        transactions.add(transaction);
        invokeHooks(transaction);



    }



    private void invokeHooks(Transaction transaction)
    {

        ArrayList<String> urls = subscriptionStore.GetSubscription(transaction);
        for(String url : urls)
        {
            // make a HTTP put call with transactin details to given url
        }

    }
}
