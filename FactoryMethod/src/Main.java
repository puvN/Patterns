import pizza.Pizza;
import pizzastore.ChicagoPizzaStore;
import pizzastore.NYPizzaStore;
import pizzastore.PizzaStore;

/**
 * Created by puvn on 08.04.16.
 * Паттерн фабричный метод определяет интерфейс создания объекта но позволяет субклассам выбрать класс создаваемого
 * экземпляра. Таким образом, Фабричный Метод делегирует операцию создания экземпляра субклассам.
 */
public class Main {
    public static void main(String args[]) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore nyStore = new NYPizzaStore();

        Pizza chicagoPizza = chicagoStore.orderPizza("cheeze");
        Pizza NYPizza = nyStore.orderPizza("cheeze");
    }
}
