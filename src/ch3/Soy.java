package ch3;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 두유";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if(getSize() == Size.TALL) {
            cost = .10 + cost;
        } else if(getSize() == Size.GRANDE) {
            cost = .15 + cost;
        } else if(getSize() == Size.VENTI) {
            cost = .20 + cost;
        }

        return cost;
    }
}
