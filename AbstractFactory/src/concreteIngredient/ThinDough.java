package concreteIngredient;

import ingredient.Dough;

/**
 * Created by puvn on 11.04.16.
 */
public class ThinDough implements Dough {
    @Override
    public Dough create() {
        System.out.println("Thin dough");
        return this;
    }
}
