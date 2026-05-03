package question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pet {

    static List<Pet> pets = new ArrayList<>();

    private String name;
    private String animal;
    private String breed;
    private String color;
    private double price;

    /*
    * @ Accessors
     */

    public String getName() {
        return name;
    }

    public String getAnimal() {
        return animal;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
    /*
     * @ Mutators
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void setPets(List<Pet> pets) {
        Pet.pets = pets;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pet(){
        // default constructor does nothing
    }

    public Pet(String name, String animal, String breed, String color, double price){
        setName(name);
        setAnimal(animal);
        setBreed(breed);
        setColor(color);
        setPrice(price);
    }

    @Override
    public String toString(){
       return String.format("%s: a %s %s %s purchased for $%.2f%n", name, color, breed, animal, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pet)) return false;
        Pet other = (Pet) obj;
        return Objects.equals(this.animal, other.animal) && Objects.equals(this.breed, other.breed);
    }
}
