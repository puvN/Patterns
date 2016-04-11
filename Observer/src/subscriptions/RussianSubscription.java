package subscriptions;

import magazine.Subject;

/**
 * Created by puvn on 05.04.16.
 */
public class RussianSubscription implements Subscription {
    private Subject magazine;

    public RussianSubscription(Subject magazine) {
        this.magazine = magazine;
        this.magazine.addSubscription(this);
    }

    @Override
    public void update() {
        System.out.println("Getting magazine for Russia");
    }
}
