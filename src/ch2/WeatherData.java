package ch2;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float perssuer;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);

        if(i >= 0) {
            observers.remove(i);
        }

    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.update(temperature, humidity, perssuer);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.perssuer = pressure;
        measurementsChanged();
    }

}
