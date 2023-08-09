package oop.behavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // do nothing !!
        System.out.println("<<Silence>> !!");
    }
}
