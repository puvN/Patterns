package behaviors;

/**
 * Created by puvn on 05.04.16.
 */
public class SlowWalk implements WalkBehavior {
    @Override
    public void walk() {
        System.out.println("Slow walk...");
    }
}
