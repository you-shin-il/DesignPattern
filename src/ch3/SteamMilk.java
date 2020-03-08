package ch3;

public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 스팀 밀크";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if(getSize() == Size.TALL) {
            cost = .5 + cost;
        } else if(getSize() == Size.GRANDE) {
            cost = .10 + cost;
        } else if(getSize() == Size.VENTI) {
            cost = .15 + cost;
        }

        return cost;
    }
}
