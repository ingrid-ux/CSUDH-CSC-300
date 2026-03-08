package question2;

import java.util.Random;


public class FastShopper extends Shopper {

    private Random randy;
    public static int fastShopperCounter = 0;
    public static final int TIMEWITHCHECKER = 1;
    private String fastShopperID;

    private int startTime;
    private int timeShopping;
    private int shoppingTimeRemaining;
    private int timeIntoCheckoutLine;
    private int timeOutOfCheckoutLine;
    private int endTime;
    private int totalTimeCheckingOut;
    private int totalTimeInStore;

    public FastShopper(int startTime){
        super("FastShopper");
        randy = new Random(fastShopperCounter);
        setFastShopperID();
        setStartTime(startTime);
        setTimeShopping();
        setShoppingTimeRemaining(timeShopping); // must be done last

    }

    // ** startTime *
    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    // ** timeShopping
    public int getTimeShopping() {
        return timeShopping;
    }

    // ** shoppingTimeRemaining *
    @Override
    public void setShoppingTimeRemaining(int timeRemaining) {
        this.shoppingTimeRemaining = timeRemaining;
    }

    @Override
    public int getShoppingTimeRemaining() {
        return shoppingTimeRemaining;
    }

    // ** timeIntoCheckoutLine *
    @Override
    public void setTimeIntoCheckoutLine(int timeIntoCheckoutLine) {
        this.timeIntoCheckoutLine = timeIntoCheckoutLine;
    }

    public int getTimeIntoCheckoutLine() {
        return timeIntoCheckoutLine;
    }

    // ** timeOutOfCheckoutLine
    public void setTimeOutOfCheckoutLine(int time) {
        this.timeOutOfCheckoutLine = time;
        calculateFinalDurations();
    }

    public int getTimeOutOfCheckoutLine() {
        return timeOutOfCheckoutLine;
    }

    // ** endTime
    public int getEndTime() {
        return endTime;
    }

    // ** totalTimeCheckingOut
    @Override
    public int getTotalTimeCheckingOut() {
        return totalTimeCheckingOut;
    }

    // ** totalTimeInStore
    public int getTotalTimeInStore() {
        return totalTimeInStore;
    }

    // ** fastFastShopperID *
    public String getFastShopperID(){ return fastShopperID; }

    public void setFastShopperID() {
        fastShopperCounter++;
        fastShopperID = getShopperType() + fastShopperCounter;
    }

    public void setTimeShopping(){
        timeShopping = randy.nextInt(6) + 1; // inclusive 1 - 6
    }

    public void calculateFinalDurations(){
        endTime = timeOutOfCheckoutLine + TIMEWITHCHECKER;
        totalTimeCheckingOut = Math.abs(endTime - timeIntoCheckoutLine);
        totalTimeInStore = Math.abs(endTime - startTime);
    }

    @Override
    public String toString(){
        return String.format(
                "%s | Start: %d | End: %d | Shopping: %d | Checkout: %d | Total: %d",
                fastShopperID,
                startTime,
                endTime,
                timeShopping,
                totalTimeCheckingOut,
                totalTimeInStore
        );
    }
}
