package oop.client;

import oop.behavior.fly.FlyBehavior;
import oop.behavior.quack.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();;
    }

    public void performFly(){
        flyBehavior.fly();;
    }

    public void swim(){}
     String display(){
        return "";
    }




}
