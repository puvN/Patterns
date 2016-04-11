import pizza.Brunella;
import pizza.Margarita;
import pizza.Pizza;
import toppings.Becon;
import toppings.Cheeze;
import toppings.Pepper;

/**
 * Created by puvn on 05.04.16.
 * Паттерн декоратор динамически наделят объект новыми возможностями и является гибкой альтернативой субклассированию
 * в области расширения функциональности.
 */
public class Main {
    public static void main(String args[]) {
        System.out.println("You order Brunella with Becon, pepper  and double Cheeze and 2 Margarita with Becon");

        Pizza brunella = new Brunella();
        brunella = new Becon(brunella);
        brunella = new Cheeze(brunella);
        brunella = new Cheeze(brunella);
        brunella = new Pepper(brunella);

        Pizza margarita1 = new Margarita();
        margarita1 = new Becon(margarita1);

        Pizza margarita2 = new Margarita();
        margarita2 = new Becon(margarita2);

        System.out.println("You order:");
        System.out.println(brunella.getDescription() + " - " + brunella.cost());
        System.out.println(margarita1.getDescription() + " - " + margarita1.cost());
        System.out.println(margarita2.getDescription() + " - " + margarita2.cost());
    }
}
