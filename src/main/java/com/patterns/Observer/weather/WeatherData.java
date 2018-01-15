package com.patterns.Observer.weather;

import java.util.*;

public final class WeatherData implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;

    public void registerObserver(final Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(final Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(final double temperature, final double humidity, final double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
