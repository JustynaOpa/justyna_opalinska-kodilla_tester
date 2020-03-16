package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Paris", "Madrid"));
        flights.add(new Flight("Amsterdam", "Paris"));
        flights.add(new Flight("Katowice", "Frankfurt"));
        flights.add(new Flight("Frankfurt", "New York"));
        flights.add(new Flight("Frankfurt", "Amsterdam"));

        return flights;

    }
}
