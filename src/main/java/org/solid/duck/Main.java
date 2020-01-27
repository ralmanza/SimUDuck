package org.solid.duck;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("=====================");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.setQuackBehavior(new Squeak());
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println("=====================");
        Duck DecoyDuck = new RubberDuck();
        DecoyDuck.setFlyBehavior(new FlyNoWay());
        DecoyDuck.setQuackBehavior(new MuteQuack());
        DecoyDuck.performFly();
        DecoyDuck.performQuack();
    }
}
