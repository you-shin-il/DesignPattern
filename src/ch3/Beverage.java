package ch3;

public abstract class Beverage {
    String description = "";
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}