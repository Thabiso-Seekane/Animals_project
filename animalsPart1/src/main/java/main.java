public class main {
    public static void main(String[] args){
        home objhome = new home();
        dog objdog = new dog();
        dog objdog1 = new dog();
        cat objcat = new cat();


        objhome.adoptPet(objdog);
        objhome.adoptPet(objdog1);
        objhome.adoptPet(objcat);
        objhome.makeAllSounds();

    }
}
