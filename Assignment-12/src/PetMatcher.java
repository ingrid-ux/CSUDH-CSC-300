import java.util.*;

public interface PetMatcher {
    // Abstract method
    List<Pet> matchPet(Pet p);

    default Pet first(Pet p){
        int index = Pet.pets.indexOf(p);
        if (index < 0){
            return null;
        }else{
            return Pet.pets.get(index);
        }
    }

}
