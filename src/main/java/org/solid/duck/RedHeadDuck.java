package org.solid.duck;

public class RedHeadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Red head Duck display");
    }

    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void quack() {
        System.out.println("Duck quack");
    }
}
