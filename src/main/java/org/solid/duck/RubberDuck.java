package org.solid.duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck display");
    }
}
