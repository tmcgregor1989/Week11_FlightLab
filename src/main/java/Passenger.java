import java.util.Random;

public class Passenger {

    private String name;
    private int bags;
    private Flight flight;
    private Integer seatNumber;



    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = null;
        this.seatNumber = null;
    }

//    public Integer getSeatNumber() {
//        return seatNumber;
//    }
    public Boolean checkSeatNumber(){
        if(this.seatNumber != null){
            return true;
        }
        return false;
    }

    public void setSeatNumber(int capacity) {
        this.seatNumber = (int)Math.floor(Math.random()*capacity);
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public Boolean checkPassengerHasFlight(){
        if(this.flight != null){
            return true;
        }
        return false;
    }
}
