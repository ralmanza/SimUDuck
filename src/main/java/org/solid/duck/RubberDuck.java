package org.solid.duck;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("Rubber Duck display");
    }

    @Override
    public void quack() {
        System.out.println("Rubber Duck Squeak");
    }
}
