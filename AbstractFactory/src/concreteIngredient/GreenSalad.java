package concreteIngredient;

import ingredient.Salad;

/**
 * Created by puvn on 11.04.16.
 */
public class GreenSalad implements Salad {
    @Override
    public Salad create() {
        System.out.println("Green salad");
        return this;
    }
}
