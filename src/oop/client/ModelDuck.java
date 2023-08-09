package oop.client;

import oop.behavior.fly.FlyNoWay;
import oop.behavior.quack.Quack;

public class ModelDuck extends  Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    String display() {
        return "I'm a model Duck !!!";
    }
}
