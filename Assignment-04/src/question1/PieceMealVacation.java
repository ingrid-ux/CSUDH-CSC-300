package question1;

public class PieceMealVacation extends Vacation {
    PieceMealVacation(String destination, double budget, String[] items, double[] costs) {
        super(destination, budget);
    }

    private String[] items; // The list of items on the vacation
    private double[] costs; // the corresponding price of each item

    @Override
    double overBudget() {
        return 0;
    }


}
