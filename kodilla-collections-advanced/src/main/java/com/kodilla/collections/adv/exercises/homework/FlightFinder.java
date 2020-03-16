package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {

        List<Flight> result = new ArrayList<>();
        for(FlightRepository fly: FlightRepository.getFlightsTable());

        return result;

    }


    public List<Flight> findFlightsTo(String arrival) {
        String z = "Paris";
        for (Flight fly : findFlightsTo(arrival)) {
            if (arrival.equals(z)) {
                System.out.println(fly.getArrival());
            }
        }

    }
}
