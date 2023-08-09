package oop;

import oop.behavior.FlyBehavior;
import oop.behavior.FlyWithWings;
import oop.behavior.Quack;
import oop.behavior.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    String display() {
        return "I'm a reall mallardDuck !!";
    }


}
