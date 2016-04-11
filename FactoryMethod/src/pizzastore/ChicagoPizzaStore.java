package pizzastore;

import pizza.Pizza;

/**
 * Created by puvn on 08.04.16.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza orderPizza(String type) {
        System.out.println("Getting order in Chicago");
        createPizza(type);
        return null;
    }

    @Override
    protected Pizza createPizza(String type) {
        System.out.println("Creating pizza in Chicago");
        return null;
    }
}
