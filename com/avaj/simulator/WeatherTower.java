package com.avaj.simulator;

import com.avaj.weather.Coordinates;
import com.avaj.weather.WeatherProvider;

/**
 * Created by victor on 18/05/2017.
 */
public class WeatherTower extends Tower {

    public String getWeather(Coordinates coordinates)
    {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    void changeWeather()
    {
        this.conditionChanged();
    }

}
