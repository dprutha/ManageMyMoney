package manager;

import model.Transaction;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sushantathley on 11/21/15.
 */
public class SubscriptionStoreImplementation implements SubscriptionStore {


    private ArrayList<String> urls = new ArrayList<String>();


    public void Subscribe(String url) {
        urls.add(url);
    }

    public ArrayList<String> GetSubscription(Transaction transaction) {
        return urls;
    }
}
