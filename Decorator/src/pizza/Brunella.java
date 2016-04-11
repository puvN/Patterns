package pizza;

/**
 * Created by puvn on 05.04.16.
 */
public class Brunella extends Pizza {
    public Brunella() {
        this.description = "Brunella";
    }

    @Override
    public double cost() {
        return 9.99;
    }
}
