package concreteIngredientFactory;

import concreteIngredient.GreenSalad;
import concreteIngredient.PikantoSauce;
import concreteIngredient.ThickDough;
import ingredient.*;
import ingredientFactory.PizzaIngredientFactory;

/**
 * Created by puvn on 11.04.16.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickDough().create(); // В Чикаго любят пиццу на толстом тесте
    }

    @Override
    public Salad createVeggie() {
        return new GreenSalad().create(); // К вегги-пицце добавляется зеленый салат
    }

    @Override
    public Sauce createSauce() {
        return new PikantoSauce().create(); // C пикантным соусом
    }
}
