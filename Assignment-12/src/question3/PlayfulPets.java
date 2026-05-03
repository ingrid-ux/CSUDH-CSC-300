package question3;

import java.util.ArrayList;
import java.util.List;

public class PlayfulPets {

    public static void main(String[] args){

        Pet.pets.add(new Pet("Scruffy","dog","collie","brown",695.00));
        Pet.pets.add(new Pet("Meow","cat","siamese","white",740.25));
        Pet.pets.add(new Pet("Max","dog","collie","black",540.50));
        Pet.pets.add(new Pet("Cuddles","dog","pug","black",1282.75));
        Pet.pets.add(new Pet("HotDog","dog","dachsund","brown",921.75));
        Pet.pets.add(new Pet("Slider","snake","garden","green",320.00));

        // lambda expression for breed matcher
        PetMatcher breedMatcher = (Pet p)->{
            List<Pet> listSameBreed = new ArrayList<>();
            for(Pet pet : Pet.pets){
                if (pet.getBreed() != null && pet.getBreed().equals(p.getBreed())){
                    listSameBreed.add(pet);
                }
            }
            return listSameBreed;
        };
        /*
            ** Create a new PetMatcher called priceMatcher that implements matchPet returning a List of all
            ** those Pets less than or equal to the price of the input parameter Pet.
         */
        PetMatcher priceMatcher = new PetMatcher() {
            public List<Pet> matchPet(Pet p){
                List<Pet> listPrice = new ArrayList<>();
                for (Pet pet: Pet.pets){
                    if (pet.getPrice() <= p.getPrice()){
                        listPrice.add(pet);
                    }
                }
                return listPrice;
            }
            /*
            * * priceMatcher also overrides
            * * the firstPet method, creating a new firstPet that searches Pets.pet for a Pet less than or equal to
            * * the price of the input Pet, returning a reference to the first such instance of such a Pet. If no such
            * * Pet exists return null
             */

            @Override
            public Pet firstPet(Pet p) {
                for(Pet pet: Pet.pets){
                    if(pet.getPrice() <= p.getPrice()){
                        return pet;
                    }
                }
                return null;
            }
        };

        /*
        **
        * *  Create a new PetMatcher called colorMatcher that implements matchPet returning a List of all
        * *  those Pets equal to the color of the input parameter Pet.(Remember color is a String so use the
        * *  equals method on the colors.) colorMatcher also overrides the firstPet method, creating a new
        * *  firstPet that searches Pets.pet for a Pet with a color that equals the color of the input Pet,
        * *  returning a reference to the first such instance of such a Pet. If no such Pet exists return null.
         */
        PetMatcher colorMatcher = new PetMatcher() {
            @Override
            public List<Pet> matchPet(Pet p) {
                List<Pet> listColor = new ArrayList<>();
                for (Pet pet: Pet.pets){
                    if(pet.getColor() != null && pet.getColor().equals(p.getColor())){
                        listColor.add(pet);
                    }
                }
                return listColor;
            }
            @Override
            public Pet firstPet(Pet p) {
                for (Pet pet : Pet.pets) {
                    if (pet.getColor() != null && pet.getColor().equals(p.getColor())) {
                        return pet;
                    }
                }
                return null;
            }
        };
        // calls
        matchPetsFromTheList("Collies",breedMatcher, new Pet(null, "dog", "collie", null, 0.0));
        matchPetsFromTheList("Pets for $750 or less",priceMatcher, new Pet(null, null, null, null, 750.0));
        matchPetsFromTheList("Pets that are brown",colorMatcher, new Pet(null, null, null, "brown", 0.0));
    }
    public static void matchPetsFromTheList(String criteria, PetMatcher matcher, Pet myPet){
        System.out.printf("%s:%nFirst: %s%n", criteria, matcher.firstPet(myPet));

        System.out.printf("All matches:%n");
        for (Pet p: matcher.matchPet(myPet)){
            System.out.printf("%s",p);
        }
        System.out.printf("%n");

    }


}
