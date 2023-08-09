package oop;

import oop.behavior.QuackBehavior;

public class RubberDuck extends Duck implements QuackBehavior {

    @Override
    String display() {
        return super.display();
    }

    @Override
    public void quack() {

    }
}
