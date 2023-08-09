package oop.behavior.quack;

public class Squeak implements  QuackBehavior{
    @Override
    public void quack() {
        // rubber duckie squeak
        System.out.println("Squeak !!");
    }
}
