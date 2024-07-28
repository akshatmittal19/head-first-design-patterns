package chapter1;

public class RubberDuck extends Duck {
    String colour;
    RubberDuck(String colour)
    {
        this.colour = colour;
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeak());
    }

    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
