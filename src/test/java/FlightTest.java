import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;
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
        flight2 = new Flight(pilot, plane2, "FL1235", "FLA", "GLA", "10:00", cabinCrewToo);
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.countPassengers());

    }

    @Test
    public void hasCabinCrew(){
        assertEquals(3, flight.countCabinCrew());

    }

    @Test
    public void canReturnAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(46, flight.countAvailableSeats());

    }

    @Test
    public void canBookPassengerIfAvailableSeats(){
            flight.bookPassenger(passenger2);
            assertEquals(1, flight.countPassengers());

    }

    @Test
    public void cannotBookPassengerIfPlaneFull(){
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        flight2.bookPassenger(passenger3);
        assertEquals(2, flight2.countPassengers());

    }

    @Test
    public void passengerHasFlight(){
        flight.bookPassenger(passenger1);
        assertEquals(true, passenger1.checkPassengerHasFlight());
    }

    @Test
    public void passengerHasSeatNumber(){
        flight.bookPassenger(passenger1);
        assertEquals(true, passenger1.checkSeatNumber());
    }


}
