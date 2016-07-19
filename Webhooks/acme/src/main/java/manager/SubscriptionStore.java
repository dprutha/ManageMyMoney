package manager;

import model.Transaction;

import java.util.ArrayList;

/**
 * Created by sushantathley on 11/21/15.
 */
public interface SubscriptionStore {

    public void Subscribe(String url);

    public ArrayList<String> GetSubscription(Transaction transaction);
}
