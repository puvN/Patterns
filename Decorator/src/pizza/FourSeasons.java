package pizza;

/**
 * Created by puvn on 05.04.16.
 */
public class FourSeasons extends Pizza {
    public FourSeasons() {
        this.description = "FourSeasons";
    }

    @Override
    public double cost() {
        return 6.39;
    }
}
