package characters;

import behaviors.AttackBehavior;
import behaviors.WalkBehavior;

/**
 * Created by puvn on 05.04.16.
 */
public abstract class Character {
    WalkBehavior wb;
    AttackBehavior ab;

    public Character() {}

    public void performWalk() {
        this.wb.walk();
    }

    public void display() {

    }

    public void performAttack() {
        this.ab.attack();
    }

    public void setAttackBehavior(AttackBehavior ab) {
        this.ab = ab;
    }

    public void setWalkBehavior(WalkBehavior wb) {
        this.wb = wb;
    }
}
