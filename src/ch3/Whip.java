package ch3;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 휘핑";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = .10 + beverage.cost();

        if(getSize() == Size.TALL) {
            cost += .10;
        } else if(getSize() == Size.GRANDE) {
            cost += .15;
        } else if(getSize() == Size.VENTI) {
            cost += .20;
        }

        return cost;
    }
}
