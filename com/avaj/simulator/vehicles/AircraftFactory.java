package com.avaj.simulator.vehicles;

import com.avaj.weather.Coordinates;

/**
 * Created by victor on 18/05/2017.
 */
public class AircraftFactory {

    public Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
    {
        Coordinates coordinates = new Coordinates(longitude, latitude, height);

        if (type.toLowerCase().equals("baloon"))
            return new Baloon(name, coordinates);
        else if (type.toLowerCase().equals("jetplane"))
            return new JetPlane(name, coordinates);
        else if (type.toLowerCase().equals("helicopter"))
            return new Helicopter(name, coordinates);
        return null;
    }

}
