package ch3;

public class Decaf extends Beverage {
    public Decaf() {
        description = "디카페";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}