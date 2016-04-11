package pizzastore;

import pizza.Pizza;

/**
 * Created by puvn on 08.04.16.
 */
public abstract class PizzaStore {
    public abstract Pizza orderPizza(String type);
    protected abstract Pizza createPizza(String type);
}
