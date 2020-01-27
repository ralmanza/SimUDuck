package org.solid.duck;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Red head Duck display");
    }
}
