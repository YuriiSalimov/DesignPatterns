package com.patterns.Observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public final class ForecastDisplay implements Observer, DisplayElement {

    private double currentPressure = 29.92;
    private double lastPressure;

    public ForecastDisplay(final Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(final Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            final WeatherData weatherData = (WeatherData) observable;
            this.lastPressure = this.currentPressure;
            this.currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        final String forecast = getForecast();
        System.out.println("Forecast: " + forecast);
    }

    private String getForecast() {
        final String forecast;
        if (this.currentPressure > this.lastPressure) {
            forecast = "Improving weather on the way!";
        } else if (this.currentPressure == lastPressure) {
            forecast = "More of the same";
        } else if (this.currentPressure < this.lastPressure) {
            forecast = "Watch out for cooler, rainy weather";
        } else {
            forecast = "";
        }
        return forecast;
    }
}
