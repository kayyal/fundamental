package oop;

import oop.behavior.FlyBehavior;
import oop.behavior.QuackBehavior;

public class RedheadDuck extends  Duck implements FlyBehavior, QuackBehavior {
    @Override
    String display() {
        return super.display();
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
