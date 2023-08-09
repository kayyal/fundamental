package oop;

import oop.behavior.FlyNoWay;
import oop.behavior.Quack;

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
