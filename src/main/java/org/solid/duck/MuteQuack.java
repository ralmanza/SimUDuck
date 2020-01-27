package org.solid.duck;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Duck can't quack");
    }
}
