package oop.behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        //implement duck Quacking
        System.out.println("Quack !!!");
    }
}
