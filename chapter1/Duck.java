package chapter1;

public class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public void setQuackBehaviour(QuackBehaviour quackBehaviour)
    {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void display() {
        System.out.println("Default duck");
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }
}
