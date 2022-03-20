import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    FlightManager flightManager;
    Pilot pilot;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Plane plane;
    Plane plane2;
    ArrayList<CabinCrew> cabinCrew;
    ArrayList<CabinCrew> cabinCrewToo;

    @Before
    public void before(){
        pilot = new Pilot("Fox McCloud", Rank.CAPTAIN, "SF123");
        cabinCrew1 = new CabinCrew("Falco Lombardi", Rank.FIRSTOFFICER);
        cabinCrew2 = new CabinCrew("Slippy Toad", Rank.PURSER);
        cabinCrew3 = new CabinCrew("Peppy Hare", Rank.FLIGHTATTENDENT);
        passenger1 = new Passenger("John", 2);
        passenger2 = new Passenger("Jim", 1);
        passenger3 = new Passenger("Jane", 2);
        passenger4 = new Passenger("Jean", 3);
        passenger5 = new Passenger("Jorge", 1);
        plane = new Plane(PlaneType.CONCORDE);
        plane2 = new Plane(PlaneType.PIPER);
        cabinCrew = new ArrayList<>(Arrays.asList(cabinCrew1, cabinCrew2, cabinCrew3));
        cabinCrewToo = new ArrayList<>(Arrays.asList(cabinCrew1, cabinCrew2));
        flight = new Flight(pilot, plane, "FL1234", "FLA", "GLA", "10:00", cabinCrew);
        flightManager = new FlightManager(flight);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
    }

    @Test
    public void canCalculateBaggageReserve(){
        assertEquals(2.5, flightManager.calculateBaggageReservePerPassenger(), 0.0);
    }

    @Test
    public void canCalculateHowMuchBaggageWeightHasBeenBooked(){
        assertEquals(9, flightManager.calculateBaggageWeightBooked());
    }

    @Test
    public void canCalculateRemainingBaggageReserve(){
        assertEquals(116, flightManager.calculateRemainingBaggageReserve(), 0);
    }



}
