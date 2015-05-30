package com.mnknowledge.dp.behavioral.observer.wheather;

/**
 * Neighborhood Weather App Demo, demonstrating sample usage of Observer Pattern in Java.
 *
 * @author siiliev
 *
 */
public class NeighborhoodWeatherAppDemo {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // define our weather API
        NeighborhoodWeatherAPI weatherAPI = new NeighborhoodWeatherAPI();

        // define our views/observers
        CurrentView currentWeather = new CurrentView(weatherAPI);
        StatisticsView weatherStatistics = new StatisticsView(weatherAPI);
        ForecastView weatherForecase = new ForecastView(weatherAPI);

        // weather changes now
        weatherAPI.setMeasurements(80, 65, 30.4f);
        weatherAPI.setMeasurements(82, 70, 29.2f);
        weatherAPI.setMeasurements(78, 90, 29.2f);
    }
}
