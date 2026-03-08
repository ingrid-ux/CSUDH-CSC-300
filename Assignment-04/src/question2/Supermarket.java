package question2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Supermarket {
    // instance variables
    private String superName;
    private int bigCheckerOccupied = 0;
    private int fastCheckerOccupied = 0;

    ArrayList<Shopper> currentShoppers = new ArrayList<Shopper>();
    ArrayList<BigShopper> bigCheckOut = new ArrayList<BigShopper>();
    ArrayList<FastShopper> fastCheckOut = new ArrayList<FastShopper>();
    ArrayList<Shopper> doneShopping = new ArrayList<Shopper>();

    public Supermarket(String value){
        setSuperName(value);
    }


    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public String getSuperName() {
        return superName;
    }

    public void openSupermarket(){
        for(int i = 0; i < 14; i++){
            if(i % 3 == 0){
                BigShopper bigShopper = new BigShopper(0);
                currentShoppers.add(bigShopper);
            }else{
                FastShopper fastShopper = new FastShopper(0);
                currentShoppers.add(fastShopper);
            }
        }
    }

    public void operateSupermarket(int minutes){
        int minCounter= 1;

        while (!(currentShoppers.isEmpty())|| !(bigCheckOut.isEmpty())  || !(fastCheckOut.isEmpty())){
            // This section lets more shoppers in
            if(minCounter <= minutes && (minCounter % 5 == 0)){
                for(int i = 0; i < 9; i++){
                    if (i % 3 == 0){
                        BigShopper bigShopper = new BigShopper(minCounter);
                        currentShoppers.add(bigShopper);
                    } else{
                        FastShopper fastShopper = new FastShopper(minCounter);
                        currentShoppers.add(fastShopper);
                    }
                }
            }

            // This section processes the Shoppers
            for (int i = 0; i < currentShoppers.size(); i++){
                Shopper tempShopper = currentShoppers.get(i);
                int shoppingTimeRemaining = tempShopper.getShoppingTimeRemaining() - 1;
                tempShopper.setShoppingTimeRemaining(shoppingTimeRemaining);
                if (shoppingTimeRemaining == 0){
                    if(tempShopper instanceof BigShopper){
                        BigShopper tempBig = (BigShopper) tempShopper;
                        tempBig.setTimeIntoCheckoutLine(minCounter);
                        bigCheckOut.add(tempBig);
                    }else{
                        FastShopper tempFast = (FastShopper) tempShopper;
                        tempFast.setTimeIntoCheckoutLine(minCounter);
                        fastCheckOut.add(tempFast);
                    }
                    currentShoppers.remove(i);
                    i--;
                }
            }

            //process the Big Checkout
            if(!(bigCheckOut.isEmpty()) && bigCheckerOccupied == 0){
                BigShopper tempBig = bigCheckOut.remove(0);
                tempBig.setTimeOutOfCheckoutLine(minCounter);
                doneShopping.add(tempBig);
                bigCheckerOccupied = BigShopper.TIMEWITHCHECKER;
            } else if(bigCheckerOccupied != 0){
                bigCheckerOccupied--;
            }

            if(!fastCheckOut.isEmpty() && fastCheckerOccupied == 0){
                FastShopper tempFast = fastCheckOut.remove(0);
                tempFast.setTimeOutOfCheckoutLine(minCounter);
                doneShopping.add(tempFast);
                fastCheckerOccupied = FastShopper.TIMEWITHCHECKER;
            } else if(fastCheckerOccupied != 0){
                fastCheckerOccupied--;
            }
            minCounter++;

        } // end of while loop

    }

    public void generateSupermarketResults(String inputFileName) throws IOException {


        PrintWriter output = new PrintWriter(inputFileName);

        output.printf("Data for Supermarket %s%n", superName);

        output.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                "Shopper ID", "Start Time", "End Time",
                "Time Shopping", "Checkout Time", "Time In Store");

        double bigTotal = 0;
        double fastTotal = 0;
        int bigCount = 0;
        int fastCount = 0;

        Iterator<Shopper> iterator = doneShopping.iterator();

        while (iterator.hasNext()) {

            Shopper s = iterator.next();
            output.println(s.toString());
            // FOR BIGSHOPPER OBJECTS
            if (s instanceof BigShopper) {
                bigTotal += s.getTotalTimeCheckingOut();
                bigCount++;
            } else { // FOR FASTSHOPPER OBJECTS
                fastTotal += s.getTotalTimeCheckingOut();
                fastCount++;
            }
        }

        double bigAverage = (bigCount == 0) ? 0 : bigTotal / bigCount;

        double fastAverage = (fastCount == 0) ? 0 : fastTotal / fastCount;

        output.println();
        output.printf("The average time checking out on the Big Queue for %d Shoppers is $%.2f minutes%n",bigCount, bigAverage);
        output.printf("The average time checking out on the Fast Queue for %d Shoppers is $%.2f minutes",fastCount, fastAverage);

        output.close();
    }

}
