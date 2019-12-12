import java.util.*;

public class home {
    ArrayList<animals> pets = new ArrayList<animals>();

    public void adoptPet(animals pet){
        pets.add(pet);
    }
    public void makeAllSounds(){
        for(animals a: pets){
            a.sounds();
        }
    }
}
