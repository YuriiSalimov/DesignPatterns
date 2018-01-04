package com.patterns.Observer.weather;

public final class StatisticsDisplay implements Observer, DisplayElement {

    private double maxTemperature;
    private double minTemperature = 200;
    private double temperatureSum;
    private int numReadings;


    public StatisticsDisplay(final Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(final double temperature, final double humidity, final double pressure) {
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

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (this.temperatureSum / this.numReadings)
                + "/" + this.maxTemperature + "/" + this.minTemperature);
    }
}
