package concreteIngredient;

import ingredient.Sauce;

/**
 * Created by puvn on 11.04.16.
 */
public class PikantoSauce implements Sauce {
    @Override
    public Sauce create() {
        System.out.println("Pikanto sauce");
        return this;
    }
}
