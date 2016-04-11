package concreteIngredientFactory;

import concreteIngredient.DeliciousSauce;
import concreteIngredient.RedSalad;
import concreteIngredient.ThinDough;
import ingredient.*;
import ingredientFactory.PizzaIngredientFactory;

/**
 * Created by puvn on 11.04.16.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinDough().create(); // В Нью-Йорке любят пиццу на тонком тесте
    }

    @Override
    public Salad createVeggie() {
        return new RedSalad().create(); // Вегетарианские пиццы в Нью-Йорке подаются с красным салатом
    }

    @Override
    public Sauce createSauce() {
        return new DeliciousSauce().create(); // И вкусным соусом
    }
}
