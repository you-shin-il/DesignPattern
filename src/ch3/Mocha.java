package ch3;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescrition() + " 모카";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
