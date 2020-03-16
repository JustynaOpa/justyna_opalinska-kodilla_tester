package com.kodilla.collections.adv.exercises.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    public static Map<String, List<Flight>> getFlightsTable(){
        Map<String, List<Flight>> flights = new HashMap<>();

        flights.put("one",new Flight( "Paris", "Madrid");
        flights.put("two",new Flight("Amsterdam", "Paris");
        flights.put("three", new Flight("Katowice", "Frankfurt");
        flights.put("four", new Flight("Frankfurt","New York");
        flights.put("five", new Flight("Frankfurt","Amsterdam");

        return flights;



    }
}
