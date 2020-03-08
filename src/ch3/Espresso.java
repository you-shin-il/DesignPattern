package ch3;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cose() {
        return 1.99;
    }
}