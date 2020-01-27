package org.solid.duck;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Duck squeak");
    }
}
