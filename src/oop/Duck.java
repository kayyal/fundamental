package oop;

import oop.behavior.FlyBehavior;
import oop.behavior.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;
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
