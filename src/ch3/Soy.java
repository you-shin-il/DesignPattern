package ch3;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescrition() + " 두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
