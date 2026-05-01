package question2;

import java.util.Comparator;

public class PassengerComparator implements Comparator<Passenger> {
    @Override
    public int compare(Passenger o1, Passenger o2) {
        /*
        Implement a comparator where a FirstClassPassenger precedes a CoachPassenger,. If both
        Passengers are of the same TicketClass then the Passenger with the lower TicketNumber
        precedes the Passenger with the higher TicketNumber
         */
        if(!o1.getTicketClass().equals(o2.getTicketClass())){
            if (o1.getTicketClass().equals("First")){
                return -1;
            } else {
                return 1;
            }
        }
        return Integer.compare(o1.getTicketNumber(), o2.getTicketNumber());
    }
}
