package com.patterns.Observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public final class WeatherData extends Observable {

    private double temperature;
    private double humidity;
    private double pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(final double temperature, final double humidity, final double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature() {
        return this.temperature;
    }

    public double getHumidity() {
        return this.humidity;
    }

    public double getPressure() {
        return this.pressure;
    }
}
