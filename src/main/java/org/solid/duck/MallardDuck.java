package org.solid.duck;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Mallard Duck display");
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
