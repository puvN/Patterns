package pizzastore;

import pizza.NYCheezePizza;
import pizza.Pizza;

/**
 * Created by puvn on 08.04.16.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza orderPizza(String type) {
        System.out.println("Getting order in NY");
        createPizza(type);
        return null;
    }

    @Override
    protected Pizza createPizza(String type) {
        System.out.println("Creating pizza in NY");
        return new NYCheezePizza();
    }
}
