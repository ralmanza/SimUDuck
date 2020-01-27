package org.solid.duck;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

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

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
