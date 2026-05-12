package question5;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.function.BooleanSupplier;

public class TroubleTicketingSystem {
    private static ArrayList<TroubleTicket> tickets = new ArrayList<>();
    private static LocalDate today = LocalDate.now();

    public static void populateDatabase() {
        tickets.add(new HardwareTicket("Kalpana Patel", 54641, "Cell phone won't power on", 5,
                "Smartie", "SM250", "SN546497-S23"));

        tickets.add(new SoftwareTicket("Chester Rodriguez", 89034, "MapApp can't find grandma's house", 2,
                "MapApp", "1.01", Domain.PHONE_HOSTED));

        tickets.add(new SoftwareTicket("Britney Delmonica", 91472, "Can't change banking info on website", 1,
                "awesomecheapcellphones.com", "2.65", Domain.WEB_HOSTED));

        tickets.add(new HardwareTicket("Kalpana Patel", 54641, "Cell phone's screen goes black", 7,
                "Rover", "RV100", "SN456742-R31"));
    }

    public static void main(String[] args) {

        Supplier<TroubleTicket> nextTicket = () -> {
            TroubleTicket next = null;

            for (int i = 0; i < tickets.size(); i++) {
                TroubleTicket troubTick = tickets.get(i);

                if (troubTick.getServicedDate().compareTo(today) < 0) {
                    if (next == null || troubTick.compareTo(next) < 0) {
                        next = troubTick;
                    }
                }
            }
            // end for loop
            if (next != null) {
                next.setServicedDate(today);
            }

            return next;
        };
        // end of lambda exp

        BooleanSupplier canClose = () -> {
            boolean result = false;
            Scanner keyboard = new Scanner(System.in);
            System.out.printf("Can you close the ticket (Y or N)?");
            String input = keyboard.nextLine();
            if (input.equalsIgnoreCase("Y")){
                result = true;
            }
            return result;
        };

        BooleanSupplier isQuittingTime = () -> {
            boolean result = false;
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Is it quitting time (Y or N)?");
            String input = keyboard.nextLine();
            if (input.equalsIgnoreCase("Y")){
                result = true;
            }
            return result;
        };

        populateDatabase();

        TroubleTicket next;
        boolean done = false;

        do {
            next = nextTicket.get();

            if (next != null) {
                System.out.printf("%n");
                System.out.printf("%s",next);
                System.out.printf("%n");

                if (canClose.getAsBoolean()) {
                    tickets.remove(next);
                }

                if (isQuittingTime.getAsBoolean()) {
                    done = true;
                }
            }

        } while (next != null && !done); // ends do while loop

        if (next == null) {
            System.out.printf("%nCongrats, you get a $50 bonus today!%n");
        } else {
            System.out.printf("%nSee you tomorrow%n");
        }
    }
}