package com.patterns.Observer.weather;

public final class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(final Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(final double temperature, final double humidity, final double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
