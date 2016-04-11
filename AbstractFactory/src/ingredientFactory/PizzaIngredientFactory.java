package ingredientFactory;

import ingredient.Dough;
import ingredient.Salad;
import ingredient.Sauce;

/**
 * Created by puvn on 11.04.16.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Salad createVeggie();
    public Sauce createSauce();
    //еще методы
}
