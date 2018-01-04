package com.patterns.Observer.weather;

public interface Observer {

    void update(double temp, double humidity, double pressure);
}
