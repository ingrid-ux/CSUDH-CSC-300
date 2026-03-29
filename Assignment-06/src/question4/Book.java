package question4;

public class Book {

    private String name;

    Book(String name){
        this.name = name;
    }

    //** Mutator and Accessor Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //** toString method
    @Override
    public String toString() {
        return name;
    }



}
