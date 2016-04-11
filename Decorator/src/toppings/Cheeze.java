package toppings;

import pizza.Pizza;

/**
 * Created by puvn on 05.04.16.
 */
public class Cheeze extends Topping {
    private Pizza pizza;

    public Cheeze(Pizza pizza) {
        this.pizza = pizza;
        this.description = this.pizza.getDescription() + ", Cheeze";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.99;
    }
}
