package org.solid.duck;

public abstract class Duck {

    public void quack() {
        System.out.println("Duck quack");
    }

    public void swim() {
        System.out.println("Duck swim");
    }

    public void fly() {
        System.out.printf("Duck fly");
    }

    public abstract void display();
}
