package com.animal.java;

public class Animal {

    private String name;
    public void sound(){
        System.out.println("test sound");
    }
    public void eat(){
        System.out.println(name + "Eats");
    }
    public String getName(){
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }
}
