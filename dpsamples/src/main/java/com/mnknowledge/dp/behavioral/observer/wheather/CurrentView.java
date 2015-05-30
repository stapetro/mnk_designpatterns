package com.mnknowledge.dp.behavioral.observer.wheather;

public class CurrentView implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    @SuppressWarnings("unused")
    private Subject weatherAPI;

    public CurrentView(Subject weatherData) {
        this.weatherAPI = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }
}
