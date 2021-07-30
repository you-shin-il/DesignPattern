package ch1;

import ch1.behavior.fly.FlyNoWay;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
