package chapter1;

public class DuckSimulator {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck("Yellow");
        MallardDuck mallardDuck = new MallardDuck();

        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        System.out.println();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
