package toppings;

import pizza.Pizza;

/**
 * Created by puvn on 05.04.16.
 */
public class Pepper extends Topping {
    private Pizza pizza;

    public Pepper(Pizza pizza) {
        this.pizza = pizza;
        this.description = this.pizza.getDescription() + ", Pepper";
    }

    @Override
    public double cost() {
        return pizza.cost() + .99;
    }
}
