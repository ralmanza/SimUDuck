package org.solid.duck;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("Duck swim");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public  void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();
}
