package api;

import model.SubscriptionRequest;
import model.SubscriptionResponse;

/**
 * Created by sushantathley on 11/21/15.
 */
public interface Service {

    public SubscriptionResponse Subscribe(SubscriptionRequest request);
}
