package toppings;

import pizza.Pizza;

/**
 * Created by puvn on 05.04.16.
 */
public class Becon extends Topping {
    private Pizza pizza;

    public Becon(Pizza pizza) {
        this.pizza = pizza;
        this.description = this.pizza.getDescription() + ", Becon";
    }

    @Override
    public double cost() {
        return pizza.cost() + 2.99;
    }
}
