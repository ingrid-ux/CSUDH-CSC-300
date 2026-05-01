package question2;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class Flight {
    private String flightName;
    private int seats;
    private int seatsSold;
    private Random randy;
    private LinkedList<Passenger> passBooked = new LinkedList<>();
    private PriorityQueue<Passenger> boardingQueue = new PriorityQueue<>(new PassengerComparator());

    Flight(String flightName, int seed){
        setFlightName(flightName);
        randy = new Random(seed);
        setSeats();
    }

    public void setFlightName(String fName){
        this.flightName = fName;
    }
    public void setSeats(){
        this.seats = randy.nextInt(75,151);
    }
    public void sellSeats(){
        seatsSold = randy.nextInt(0, 1 + seats/2) + seats / 2;
        for(int i = 0; i < seatsSold; i++){
            int randNum = randy.nextInt(0,5);
            if(randNum == 0){
                passBooked.add(new FirstClassPassenger());
            } else{
                passBooked.add(new CoachPassenger());
            }
        }
    }

    public void lineUpCall(){
        Iterator<Passenger> iter = passBooked.iterator();
        while(iter.hasNext()){
            boardingQueue.add(iter.next());
        }
    }

    public void boarding(PrintWriter out){
        /*
        Create the output similar to that shown in the seating.txt file found in Lesson 9 Homework file
        on Canvas, boarding passengers one at a time based on their position in the boardingQueue.
        There should be three passengers per row as well as the title line:
         */
        out.printf("The boarding order for Flight %s with %d seats and %d seats sold " +
                "is:%n", flightName, seats, seatsSold);
        while(!boardingQueue.isEmpty()){
            StringBuilder row = new StringBuilder();
            for(int i = 0; i < 3 && !boardingQueue.isEmpty(); i++){
                row.append(String.format("%-15s", boardingQueue.poll()));
            }
            out.printf("%s%n",row.toString());
        }
    }



}
