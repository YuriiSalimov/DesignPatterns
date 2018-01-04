package com.patterns.Observer.weather;

public final class ForecastDisplay implements Observer, DisplayElement {

    private double currentPressure = 29.92f;
    private double lastPressure;

    public ForecastDisplay(final Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(final double temperature, final double humidity, final double pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (this.currentPressure > this.lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (this.currentPressure == this.lastPressure) {
            System.out.println("More of the same");
        } else if (this.currentPressure < this.lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
