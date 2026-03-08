package question1;

public class AllInclusiveVacation extends Vacation{

    private String brand;
    private int rating;
    private double price;

    AllInclusiveVacation(String destination, double budget, String brand, int rating, double price) {
        super(destination, budget);
        setBrand(brand);
        setRating(rating);
        setPrice(price);
    }

    @Override
    double overBudget() {
        return price - getBudget();
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setRating(int rating) {
        if(rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating must be > 0 and <= 5");
        }
    }

    public int getRating() {
        return rating;
    }

    public void setPrice(double price) {
        if(price >= 0.0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be >= 0.0");
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return String.format("%s%nBrand: %s; Rating: %d; Price: $%.2f",
                super.toString(), brand, rating, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){ return true; } // checking if same reference
        if (obj == null){ return false; }
        if (!(obj instanceof AllInclusiveVacation)){ return false; } // checking if same class Planet

        if (!super.equals(obj)){
            return false;
        };

        AllInclusiveVacation other = (AllInclusiveVacation) obj;
        boolean brandEquals = this.brand.equalsIgnoreCase((other.brand));
        boolean ratingEquals = this.rating == other.rating;
        boolean priceEquals = Math.abs(this.price - other.price) < 0.0001;

        return brandEquals && ratingEquals && priceEquals;
    }

}

/*
    * class AllInclusiveVacation extends Vacation (35)
    * It has instance variables:
    * private String brand;
    * private int rating – from 1 to 5
    * private double price
    * It has a constructor with the 5 instance variables: The first two are for the superclass.
    * The constructor calls super, and then calls the mutators for each of the remaining variables.
    * There are also three accessor methods.
    * The setRating method sets the rating if it is >= 1 and <=5, otherwise it will
    * throw new IllegalArgumentException( "Rating must be > 0 and <= 5")
    * The setPrice method sets the price if it is >= 0.0, otherwise it will
    * throw new IllegalArgumentException( "Price must be >= 0.0")
    * The toString method returns a String with the Destination and Budget (using super()) and the
    * three other instance values and moves to the next line i.e.:
    * Destination: Orlando; Budget: $1000.00
    * Brand: Disney; Rating: 4; Price: $989.49
    * The equals(Object obj) is overridden with a value of true if the conditions from the super class
    * are true and brand (ignore the case) and rating are equal, and the prices are within 0.0001.
    * It overrides overbudget returning by how much the vacation is over or under budget as a double.
 */