package ch3;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크 로스트";
    }

    @Override
    public double cose() {
        return .99;
    }
}