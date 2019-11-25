package com.animal.java;

public class main {
    public static void main(String[] args){
        Home objhome = new Home();
        Dog objdog = new Dog();
        Dog objdog1 = new Dog();
        Cat objcat = new Cat();


        objhome.adoptPet(objdog);
        objhome.adoptPet(objdog1);
        objhome.adoptPet(objcat);
        objhome.makeAllSounds();

    }
}
