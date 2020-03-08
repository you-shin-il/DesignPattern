package ch3;

public abstract class Beverage {
    String description = "";

    public String getDescrition() {
        return description;
    }

    public abstract double cost();
}