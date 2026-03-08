package question2;

public abstract class Shopper implements ShoppingTimeRemaining {
    private String shopperType;

    Shopper(){
        setShopperType("");
    }

    Shopper(String shopperType){
        setShopperType(shopperType);
    }

    public void setShopperType(String shopperType) {
        this.shopperType = shopperType;
    }

    public String getShopperType() { return shopperType;}

    public abstract void setTimeIntoCheckoutLine(int time);
    public abstract int getTotalTimeCheckingOut();
}
