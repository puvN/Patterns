package subscriptions;

import magazine.Subject;

/**
 * Created by puvn on 05.04.16.
 */
public class CzechSubscription implements Subscription {
    private Subject magazine;

    public CzechSubscription(Subject magazine) {
        this.magazine = magazine;
        this.magazine.addSubscription(this);
    }

    @Override
    public void update() {
        System.out.println("Getting magazine for Czech Republic");
    }
}
