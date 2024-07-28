package chapter1;

public class MallardDuck extends Duck {
    MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
