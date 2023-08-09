package oop.client;

import oop.behavior.fly.FlyWithWings;
import oop.behavior.quack.Quack;

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
