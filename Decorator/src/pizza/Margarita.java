package pizza;

/**
 * Created by puvn on 05.04.16.
 */
public class Margarita extends Pizza {
    public Margarita() {
        this.description = "Margarita";
    }

    @Override
    public double cost() {
        return 5.99;
    }
}
