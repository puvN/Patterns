import ingredient.Dough;
import ingredient.Salad;
import ingredient.Sauce;
import concreteIngredientFactory.NYPizzaIngredientFactory;
import ingredientFactory.PizzaIngredientFactory;

/**
 * Created by puvn on 08.04.16.
 * Паттерн абстрактная фабрика предоставляет интерфейс для создания семейств взаимосвязанных объектов без указания их
 * конкретных классов
 */
public class Main {
    public static void main(String args[]) {
        //Изготавливаем пиццу в Нью-Йорке:
        PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();
        Salad salad = nyIngredientFactory.createVeggie();
        Dough dough = nyIngredientFactory.createDough();
        Sauce sauce = nyIngredientFactory.createSauce();
        // И дальше добавляем ингредиенты в пиццу
        // То же самое с Чикагской
    }
}
