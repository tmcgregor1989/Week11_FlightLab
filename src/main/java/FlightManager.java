import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getFlightCapacity(){
        return flight.getPlane().getPlaneType().getCapacity();
    }

    public double getTotalBaggageReserve(){
        return this.getFlight().getPlane().getPlaneType().getTotalWeight()/2;
    }

    public double calculateBaggageReservePerPassenger() {
        return getTotalBaggageReserve()/getFlightCapacity();
    }

    public ArrayList<Passenger> getPassengers(){
        return this.getFlight().getPassengers();
    }

    public int calculateBaggageWeightBooked() {
        int totalBagsBooked = 0;
        for(Passenger passenger : this.getPassengers()){
            totalBagsBooked += passenger.getBags();
        }
        return totalBagsBooked;

    }

    public double calculateRemainingBaggageReserve() {
        return this.getTotalBaggageReserve() - this.calculateBaggageWeightBooked();
    }
}
