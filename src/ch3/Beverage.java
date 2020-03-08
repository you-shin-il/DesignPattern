package ch3;

public abstract class Beverage {
    String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}