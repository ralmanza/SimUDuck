package org.solid.duck;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Duck Fly");
    }
}
