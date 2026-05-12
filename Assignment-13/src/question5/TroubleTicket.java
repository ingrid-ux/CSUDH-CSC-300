package question5;
import java.time.LocalDate;

abstract class TroubleTicket implements Comparable<TroubleTicket> {

    /* private instance variables */
    private String customerName;
    private int ticketID;
    private String description;
    private LocalDate dueDate;
    private LocalDate servicedDate;

     public TroubleTicket(String customerName, int ticketID, String description, int due) {
        setCustomerName(customerName);
        setTicketID(ticketID);
        setDescription(description);
        setDueDate(due);
        setServicedDate(LocalDate.now().minusDays(1));
    }

    /* Accessors */
    public String getCustomerName() { return customerName; }
    public int getTicketID() { return ticketID; }
    public String getDescription() { return description; }
    public LocalDate getDueDate() { return dueDate; }
    public LocalDate getServicedDate() { return servicedDate; }

    /* Mutators */
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setTicketID(int ticketID) { this.ticketID = ticketID; }
    public void setDescription(String description) { this.description = description; }

    public void setDueDate(int due) {
        this.dueDate = LocalDate.now().plusDays(due);
    }

    public void setServicedDate(LocalDate servicedDate) {
        this.servicedDate = servicedDate;
    }

    @Override
    public int compareTo(TroubleTicket other) {
        return this.dueDate.compareTo(other.dueDate);
    }

    // toString
    @Override
    public String toString() {
        return String.format("Customer NameNAME: %s%n" +
                "ID: %s%n" +
                "DESCRIPTION: %s%n" +
                "DUE DATE: %s%n" +
                "SERVICED DATE: %s%n", customerName, ticketID, description, dueDate, servicedDate);

    }
}