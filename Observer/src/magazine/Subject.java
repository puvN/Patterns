package magazine;

import subscriptions.Subscription;

/**
 * Created by puvn on 05.04.16.
 */
public interface Subject {
    public void addSubscription(Subscription subscription);
    public void removeSubscription(Subscription subscription);
    public void notifyAllSubscriptions();
}
