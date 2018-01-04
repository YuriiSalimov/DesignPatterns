package com.patterns.Observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public final class StatisticsDisplay implements Observer, DisplayElement {

    private double maxTemperature;
    private double minTemperature = 200;
    private double temperatureSum;
    private int numReadings;

    public StatisticsDisplay(final Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(final Observable observable, final Object arg) {
        if (observable instanceof WeatherData) {
            final WeatherData weatherData = (WeatherData) observable;
            final double temperature = weatherData.getTemperature();
            this.temperatureSum += temperature;
            this.numReadings++;
            if (temperature > this.maxTemperature) {
                this.maxTemperature = temperature;
            }
            if (temperature < this.minTemperature) {
                this.minTemperature = temperature;
            }
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (this.temperatureSum / this.numReadings)
                + "/" + this.maxTemperature + "/" + this.minTemperature);
    }
}
