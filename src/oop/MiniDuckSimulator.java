package oop;

import oop.behavior.fly.FlyRocketPowered;
import oop.client.Duck;
import oop.client.MallardDuck;
import oop.client.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();;
        mallard.performQuack();


        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
