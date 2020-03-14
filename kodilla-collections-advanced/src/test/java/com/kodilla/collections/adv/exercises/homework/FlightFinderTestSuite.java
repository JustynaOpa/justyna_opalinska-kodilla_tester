package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("Frankfurt");
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Frankfurt");
        //then
        assertEquals(2, result.size());


    }

    @Test
    public  void testFindFlightTo(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsTo("Paris");
        //when
        List<Flight> result = flightFinder.findFlightsTo("Paris");
        //then
        assertEquals(1, result.size());
    }

}