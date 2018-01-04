package com.patterns.Observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public final class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(final Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(final Observable observable, final Object arg) {
        if (observable instanceof WeatherData) {
            final WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + this.temperature
                + "F degrees and " + this.humidity + "% humidity");
    }
}
