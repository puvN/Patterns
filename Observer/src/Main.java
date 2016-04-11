import magazine.Magazine;
import subscriptions.CzechSubscription;
import subscriptions.EnglishSubscription;
import subscriptions.RussianSubscription;
import subscriptions.Subscription;

/**
 * Created by puvn on 05.04.16.
 *
 * Паттерн Наблюдатель определяет отношение один-ко-многим таким образом, что многие узнают о состоянии одного сразу
 * как его состояние изменится.
 */
public class Main {
    public static void main(String args[]) {
        Magazine mansHealth = new Magazine();

        Subscription russian = new RussianSubscription(mansHealth);
        new EnglishSubscription(mansHealth);
        new CzechSubscription(mansHealth);

        for (int i = 0; i < 3; i++) {
            System.out.println("Release #" + i);
            mansHealth.newReleaseHasArrived();
        }

        System.out.println("\nRussian subscription has ended\n");
        mansHealth.removeSubscription(russian);

        System.out.println("Release #" + 3);
        mansHealth.newReleaseHasArrived();

        System.out.println("\nAnother english subscription\n");
        new EnglishSubscription(mansHealth);

        System.out.println("Release #" + 4);
        mansHealth.newReleaseHasArrived();
    }
}
