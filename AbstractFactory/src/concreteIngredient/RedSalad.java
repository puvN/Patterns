package concreteIngredient;

import ingredient.Salad;

/**
 * Created by puvn on 11.04.16.
 */
public class RedSalad implements Salad {
    @Override
    public Salad create() {
        System.out.println("Red salad");
        return this;
    }
}
