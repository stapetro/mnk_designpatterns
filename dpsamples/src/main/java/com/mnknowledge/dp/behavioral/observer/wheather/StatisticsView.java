package com.mnknowledge.dp.behavioral.observer.wheather;

public class StatisticsView implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    @SuppressWarnings("unused")
    private NeighborhoodWeatherAPI weatherData;

    public StatisticsView(NeighborhoodWeatherAPI weatherAPI) {
        this.weatherData = weatherAPI;
        weatherAPI.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
