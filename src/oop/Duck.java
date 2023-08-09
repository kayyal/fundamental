package oop;

import oop.behavior.FlyBehavior;
import oop.behavior.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    FlyBehavior flyBehavior;

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
