package com.avaj.simulator.vehicles;

import com.avaj.simulator.WeatherTower;

/**
 * Created by victor on 18/05/2017.
 */
public interface Flyable {
    void updateConditions();
    void registerTower(WeatherTower weatherTower);
}
