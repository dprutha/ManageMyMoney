package api;

import manager.SubscriptionStore;
import manager.SubscriptionStoreImplementation;
import model.SubscriptionRequest;
import model.SubscriptionResponse;

/**
 * Created by sushantathley on 11/21/15.
 */
public class ServiceImplementation implements Service {

    private SubscriptionStore store;

    public ServiceImplementation()
    {
        store = new SubscriptionStoreImplementation();
    }


    public SubscriptionResponse Subscribe(SubscriptionRequest request) {
        store.Subscribe(request.Url);
        SubscriptionResponse response = new SubscriptionResponse();
        response.isSuccessful = true;
        return response;
    }
}
