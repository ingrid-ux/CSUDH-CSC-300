package question1;


public class VacationTest {

    private static void printEqual(String obj1, String obj2,boolean e){
        if (e){
            System.out.printf("%s and %s are now equal%n", obj1, obj2);
        }else{
            System.out.printf("%s and %s are not equal%n", obj1, obj2);

        }

    }

    private static void printBudgetStatus(Vacation v){
        double diff = v.overBudget();

        if(Math.abs(diff) < 0.0001){
            System.out.printf("This vacation is on budget.");
        } else if(diff > 0){
            System.out.printf("It is over budget by $%.2f%n",diff);
        } else {
            System.out.printf("It is under budget by $%.2f%n", -diff);
        }

    }

    public static void main(String[] args) {
        System.out.printf("The first all-inclusive vacation is:%n");
        AllInclusiveVacation aiv1 = new AllInclusiveVacation("Orlando", 2000.00, "Universal", 4, 1979.49);
        System.out.printf(aiv1.toString() +"%n");
        printBudgetStatus(aiv1);

        System.out.printf("%n");

        System.out.printf("The second all-inclusive vacation is:%n");
        AllInclusiveVacation aiv2 = new AllInclusiveVacation("Virgin Islands", 2100.00, "Sandals", 4, 2350.99);
        System.out.printf(aiv2.toString() + "%n");
        printBudgetStatus(aiv2);

        System.out.printf("%n");

        aiv2.setBrand(aiv1.getBrand());
        aiv2.setPrice(aiv1.getPrice());
        printEqual("avi1", "avi2", aiv1.equals(aiv2));

        aiv2.setDestination(aiv1.getDestination());
        aiv2.setBudget(aiv1.getBudget());
        printEqual("avi1", "avi2", aiv1.equals(aiv2));

        System.out.printf("%n");

        System.out.printf("The first piecemeal vacation is:%n");
        String[] itemList1 = { "lodging", "meals", "airfare", "water skiing" };
        double[] costList1 = { 750.00, 250.00, 400.00 };

        PieceMealVacation pmv1 = new PieceMealVacation("Honolulu", 1500.00, itemList1, costList1);
        System.out.printf(pmv1.toString());
        printBudgetStatus(pmv1);

        System.out.printf("%n");

        System.out.printf("The first piecemeal vacation is:%n");
        String[] itemList2 = { "lodging", "meals", "airfare", "water skiing"};
        double[] costList2 = { 750.00, 250.00, 400.00, 120.00, 200.00 };

        PieceMealVacation pmv2 = new PieceMealVacation("Honolulu", 1500.00, itemList2, costList2);
        System.out.printf(pmv2.toString());
        printBudgetStatus(pmv2);

        System.out.printf("\n");

        printEqual("pmv1", "pmv2", pmv1.equals(pmv2));
        pmv2.setItems(itemList1);
        pmv2.setCosts(costList1);
        printEqual("pmv1", "pmv2", pmv1.equals(pmv2));




        /*
        if(getBudget() - price < 0){
            return String.format("It is under budget by $%.2f",Math.abs(amount));
        }
        return String.format("It is over budget by $%.2f",Math.abs(price - getBudget()));
        */


    }
}
