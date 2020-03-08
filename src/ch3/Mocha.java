package ch3;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 모카";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if(getSize() == Size.TALL) {
            cost += .15;
        } else if(getSize() == Size.GRANDE) {
            cost += .20;
        } else if(getSize() == Size.VENTI) {
            cost += .25;
        }

        return cost;
    }
}
