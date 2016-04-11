import behaviors.*;
import characters.King;
import characters.Character;
import characters.Queen;
import characters.Wizard;

/**
 * Created by puvn on 05.04.16.
 *
 * Паттерн Стратегия определяет семейство алгоритмов для объекта, инкапсулирует их, и позволяет динамически
 * назначать алгоритм объекту на выполнение.
 */
public class Main {
    public static void main(String args[]) {
        Character king = new King();
        king.setAttackBehavior(new AttackWithSword());
        king.setWalkBehavior(new SlowWalk());

        Character queen = new Queen();
        queen.setAttackBehavior(new AttackWithBow());
        queen.setWalkBehavior(new FastWalk());

        Character wizard = new Wizard();
        wizard.setAttackBehavior(new AttackWithMagic());
        wizard.setWalkBehavior(new JumpWalk());

        System.out.println("Game started");
        System.out.println("New characters:");
        king.display();
        queen.display();
        wizard.display();

        System.out.println("King wants to attack wizard...");
        king.performAttack();

        System.out.println("Queen decides to walk");
        queen.performWalk();

        System.out.println("Wizard is jumping from kings weapon and attack");
        wizard.performWalk();
        wizard.performAttack();

        System.out.println("Queen gives King her weapon. He attacks");
        king.setAttackBehavior(new AttackWithBow());
        king.performAttack();
    }
}
