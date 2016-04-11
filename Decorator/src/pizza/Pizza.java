package pizza;

/**
 * Created by puvn on 05.04.16.
 */
public abstract class Pizza {
    protected String description = "Abstract pizza";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
