package ch3;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescrition() + " 휘핑";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
