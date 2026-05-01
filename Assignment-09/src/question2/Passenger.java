package question2;

public class Passenger {
    private String passengerID;
    private String ticketClass;
    private int ticketNumber;

    static int ticketCounter = 0; // class variable

    Passenger(String ticketClass){
        setTicketNumber();
        setTicketClass(ticketClass);
        setPassengerID();
    }

    public void setPassengerID() {
        this.passengerID = "PID_" + ticketClass + " " + ticketNumber;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setTicketClass(String tClass) {
        this.ticketClass = tClass;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketNumber() {
        ticketCounter++;
        this.ticketNumber = ticketCounter;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public String toString(){
        return passengerID;
    }

}
