package ch1.behavior.quack;

public class Qqueak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
