package concreteIngredient;

import ingredient.Dough;

/**
 * Created by puvn on 11.04.16.
 */
public class ThickDough implements Dough {
    @Override
    public Dough create() {
       System.out.println("Thick dough");
        return this;
    }
}
