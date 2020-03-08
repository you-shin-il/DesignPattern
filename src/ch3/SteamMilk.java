package ch3;

public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescrition() + " 스팀 밀크";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
