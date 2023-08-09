package oop.behavior.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // do nothing !!
        System.out.println("<<Silence>> !!");
    }
}
