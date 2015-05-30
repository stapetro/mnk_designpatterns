package com.mnknowledge.dp.behavioral.observer.wheather;

public class ForecastView implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    @SuppressWarnings("unused")
    private NeighborhoodWeatherAPI weatherData;

    public ForecastView(NeighborhoodWeatherAPI weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
