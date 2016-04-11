package magazine;

import subscriptions.Subscription;

import java.util.ArrayList;

/**
 * Created by puvn on 05.04.16.
 */
public class Magazine implements Subject {
    private ArrayList<Subscription> subscriptions = new ArrayList<>();

    @Override
    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    @Override
    public void removeSubscription(Subscription subscription) {
        int i = subscriptions.indexOf(subscription);
        if (i >= 0) subscriptions.remove(i);
    }

    @Override
    public void notifyAllSubscriptions() {
        for (Subscription subscription : subscriptions)
            subscription.update();
    }

    public void newReleaseHasArrived() {
        notifyAllSubscriptions();
    }
}
